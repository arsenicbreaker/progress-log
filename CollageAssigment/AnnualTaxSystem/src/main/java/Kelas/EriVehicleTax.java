package Kelas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EriVehicleTax extends EriTax{
    // data member
   private LocalDate productionYear; 
   private String registrationNumber;
   private double sellingPrice;

   // get set
    public LocalDate getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(LocalDate productionYear) {
        this.productionYear = productionYear;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
    
    public void setSellingPrice(double SellingPrice) {
        this.sellingPrice = SellingPrice;
    }
   
    // konstruktor
    public EriVehicleTax(String idResident,
                        String name, 
                        String address, 
                        LocalDate taxDueDate, 
                        LocalDate paymentDate,
                        LocalDate productionYear,
                        String registrationNumber,
                        double sellingPrice) {
        super(idResident, name, address, taxDueDate, paymentDate);
        this.productionYear = productionYear;
        this.registrationNumber = registrationNumber;
        this.sellingPrice = sellingPrice;
    }
    
    // method
    @Override
    public double originalTaxAmount(){
        int venicleAge = (int) ChronoUnit.YEARS.between(productionYear, LocalDate.now());
        double ageTax = (1- (venicleAge/20)* 500000.0);
        if(ageTax < 0){
            ageTax = 0;
        }
        return (2/100.0) * this.sellingPrice + ageTax;
    }

    @Override
    public double penalty() {
        if(super.getPaymentDate().isAfter(super.getTaxDueDate())){
            return (25/100.0) * originalTaxAmount();
        } else{
            return 0;
        }
        
    }

    @Override
    public double totalTax() {     
        return originalTaxAmount() + penalty();
    }

    @Override
    public String toString() {
        return super.toString() + 
                "Production Year: " + this.productionYear.getYear() + "\n"
                + "Registration Number: " + this.registrationNumber + "\n"
                + "Seling Price: Rp." + this.sellingPrice + "\n"
                + "Orgininal Tax Amount: Rp." + originalTaxAmount() + "\n"
                + "Penalty Tax: Rp." + penalty() + "\n"
                + "Total Tax: RP." + totalTax() + "\n";
                        
    }
 
   
}
