package tugaspemro.kelas;

public class ProgramStudi {
    // Data member
    private String id;
    private String nama;
   
    // konstruktor
    public ProgramStudi(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }
 
    // get set
    public String getId() {
        return id;
    }

    
    public void setId(String id) {
        this.id = id;
    }

   
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
 
    
    // method
    @Override
    public String toString() {
        return this.id + " - " + this.nama; 
    }
    
}