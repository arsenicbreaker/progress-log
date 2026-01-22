package Kelas;

import java.time.LocalDate;

public class EriBuldingTax extends EriTax{
    // data member
    private String taxObjectNumber;
    private double propertySize;
    private double buildingSize;
    
    // get set
    public String getTaxObjectNumber() {
        return taxObjectNumber;
    }

    public void setTaxObjectNumber(String taxObjectNumber) {
        this.taxObjectNumber = taxObjectNumber;
    }

    public double getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(double propertySize) {
        this.propertySize = propertySize;
    }

    public double getBuildingSize() {
        return buildingSize;
    }

    public void setBuildingSize(double buildingSize) {
        this.buildingSize = buildingSize;
    }
    
    // konstruktor
    public EriBuldingTax(String idResident,
                        String name, 
                        String address, 
                        LocalDate taxDueDate, 
                        LocalDate paymentDate,
                        String taxObjectNumber,
                        double propertySize,
                        double buildingSize) {
        super(idResident, name, address, taxDueDate, paymentDate);
        this.propertySize = propertySize;
        this.taxObjectNumber = taxObjectNumber;
        this.buildingSize = buildingSize;
    }
    
    // method
    @Override
    public double originalTaxAmount() {
        return  0.1/100 * ((this.propertySize * 3000000) + (this.buildingSize * 1000000));
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
                "Tax Object Number: " + this.taxObjectNumber + "\n"
                + "Property Size: " + this.propertySize + "\n"
                + "Bulding Size: " + this.buildingSize + "\n"
                + "Orgininal Tax Amount: Rp." + originalTaxAmount() + "\n"
                + "Penalty Tax: Rp." + penalty() + "\n"
                + "Total Tax: RP." + totalTax() + "\n";
    }
  
}
