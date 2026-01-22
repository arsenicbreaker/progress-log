package Kelas;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class EriTax implements Serializable{ // jangan lupa kasih abstrak dan implement ya
    private static final long serialVersionUID = 1L;
    
    private String idResident;
    private String name;
    private String address;
    private LocalDate taxDueDate;
    private LocalDate paymentDate;

    // get set
    public String getIdResident() {
        return idResident;
    }

    public void setIdResident(String idResident) {
        this.idResident = idResident;
    }

    public String getName() {
        return name;
    }

  
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getTaxDueDate() {
        return taxDueDate;
    }

    public void setTaxDueDate(LocalDate taxDueDate) {
        this.taxDueDate = taxDueDate;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }
  
    // konstruktor
    public EriTax(String idResident, String name, String address, LocalDate taxDueDate, LocalDate paymentDate) {
        this.idResident = idResident;
        this.name = name;
        this.address = address;
        this.taxDueDate = taxDueDate;
        this.paymentDate = paymentDate;
    }
    
    // method
    // di lindungi untuk yang bisa akses yang polymorph saja
    protected abstract double originalTaxAmount();
    
    protected abstract double penalty();
    
    protected abstract double totalTax();
    
    // to string
    @Override
    public String toString() {
        return "ID Resident: " + this.idResident + "\n"
               + "Name: " + this.name + "\n"
               + "Tax Due Date: " + this.name + "\n"
               + "Payment Date: " + this.paymentDate + "\n";
    }
 
}
