package Jobsheet11.src;

public class AlatElektronik {
    
    private double harga;
    private String warna;
    private String merk;
    
    public AlatElektronik(double harga, String warna, String merk) {
        this.harga = harga;
        this.warna = warna;
        this.merk = merk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }    

    public void displayInfo() {
        System.out.println("Harga           : " + harga);
        System.out.println("Warna           : " + warna);
        System.out.println("Merk            : " + merk);
    }

}


