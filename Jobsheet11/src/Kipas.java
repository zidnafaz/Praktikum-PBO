package Jobsheet11.src;

public class Kipas extends AlatElektronik {

    private String jenis;

    public Kipas(double harga, String warna, String merk, String jenis) {
        super(harga, warna, merk);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }    

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis Kipas     : " + jenis);
    }
    
}


