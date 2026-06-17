package tugaspemro.kelas;

import java.time.LocalDate;

public class Konsultasi {
    // Data member
    private LocalDate date;
    private double IPK;
    private String problem;
    private String advise;
      
    // Konstruktor
    public Konsultasi(LocalDate date, double IPK, String problem, String advise) {
        this.date = date;
        this.IPK = IPK;
        this.problem = problem;
        this.advise = advise;        
    }
  
    // get set
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getAdvise() {
        return advise;
    }

    public void setAdvise(String advise) {
        this.advise = advise;
    }
    
    
    
}
