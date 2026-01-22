package tugaspemro.kelas;

import java.util.ArrayList;

public class Students {
    // Data member
    private String nama;
    private String NIM;
    private ProgramStudi programStudi;         
    private ArrayList<Konsultasi> konsultasi;
    
    // konstruktor
    public Students(String nama, String NIM, ProgramStudi programStudi) {
        this.nama = nama;
        this.NIM = NIM;
        this.programStudi = programStudi;
        this.konsultasi = new ArrayList<>();
    }
     
    // get set
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    
    public ProgramStudi getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(ProgramStudi programStudi) {
        this.programStudi = programStudi;
    }
    
    // method
    public void AddKonsultasi(Konsultasi konsul){
        konsultasi.add(konsul);
    }
    
    public int NumberKonsultasi(){
        if(konsultasi.isEmpty() || konsultasi == null){
            return 0;
        } else{
            return konsultasi.size();
        }
            
    }
    
    public Konsultasi GetKonsultasi(int idx)throws Exception{
        if(!konsultasi.isEmpty() && idx >= 0 && idx < konsultasi.size()){
            return konsultasi.get(idx);
        } else {
            throw new Exception("Konsultasi tidak tersedia!");
        }
    }
    
    public void DeleteKonsulasi(int idx) throws Exception{
        if(!konsultasi.isEmpty() && idx >= 0 && idx < konsultasi.size()){
            konsultasi.remove(idx);
        } else{
            throw new Exception("Konsultasi tidak ditemukan!");
        }
    }
    
    // method
    @Override
    public String toString() {
        return this.NIM + " - " + this.nama;
    }
    
    // method untuk menampilkan konsultasi
    public String PrintKonsul(){
        String print = "";
        
        for(Konsultasi konsul : konsultasi){
            print += "Tanggal: " + konsul.getDate() + "\n"
                    + "IPK: " + konsul.getIPK() + "\n"
                    + "Masalah: " + konsul.getProblem() + "\n"
                    + "Saran: " + konsul.getAdvise() + "\n"
                    + "======================================\n";
        }        
        return print;
    }    
}

