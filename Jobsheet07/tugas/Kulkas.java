package Jobsheet07.tugas;

public class Kulkas extends Elektronik {

    private int jumlahPintu;
    private String watt;
    private String ukuran;

    public Kulkas() {

    }
    
    public Kulkas(String model, String nama, String tahunRilis, int jumlahPintu, String watt, String ukuran) {
        super(model, nama, tahunRilis);
        this.jumlahPintu = jumlahPintu;
        this.watt = watt;
        this.ukuran = ukuran;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public String getWatt() {
        return watt;
    }

    public void setWatt(String watt) {
        this.watt = watt;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }    

    public String getAllInfo() {
        String info = super.getInfo();
        
        info += "Jumlah Pintu   : " + this.jumlahPintu + "\n";
        info += "Watt           : " + this.watt + "\n";
        info += "Ukuran         : " + this.ukuran;

        return info;
    }

    public String getInfo() {
        String info = "";

        info += "Jumlah Pintu   : " + this.jumlahPintu + "\n";
        info += "Watt           : " + this.watt + "\n";
        info += "Ukuran         : " + this.ukuran;

        return info;
    }

    public String getFeature() {
        return "Produk kulkas " + this.nama + " memiliki fitur inverter yang hemat daya";
    }

    
    
}
