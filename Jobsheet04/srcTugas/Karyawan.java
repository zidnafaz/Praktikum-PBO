package Jobsheet04.srcTugas;

public class Karyawan {

    private int noKaryawan;
    private String nama;
    private String noTelp;

    public Karyawan(int noKaryawan, String nama, String noTelp) {
        this.noKaryawan = noKaryawan;
        this.nama = nama;
        this.noTelp = noTelp;
    }

    public int getNoKaryawan() {
        return noKaryawan;
    }

    public void setNoKaryawan(int noKaryawan) {
        this.noKaryawan = noKaryawan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void getNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getInfo() {
        String info = "";
        
        info += nama + " - " + noKaryawan;
    
        return info;
    }
    
}