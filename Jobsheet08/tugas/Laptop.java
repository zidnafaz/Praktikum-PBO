package Jobsheet08.tugas;

public class Laptop extends Elektronik {
    
    private String prosessor;
    private String ram;
    private String storage;
    
    public Laptop() {
        
    }

    public Laptop(String model, String nama, String tahunRilis, String prosessor, String ram, String storage) {
        super(model, nama, tahunRilis);
        this.prosessor = prosessor;
        this.ram = ram;
        this.storage = storage;
    }
    public String getProsessor() {
        return prosessor;
    }
    public void setProsessor(String prosessor) {
        this.prosessor = prosessor;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public String getStorage() {
        return storage;
    }
    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getAllInfo() {
        String info = super.getInfo();

        info += "Prosessor      : " + this.prosessor + "\n";
        info += "Ram            : " + this.ram + "\n";
        info += "Storage        : " + this.storage;

        return info;
    }

    public String getInfo() {
        String info = "";

        info += "Prosessor      : " + this.prosessor + "\n";
        info += "Ram            : " + this.ram + "\n";
        info += "Storage        : " + this.storage;

        return info;
    }

    public String getFeature() {
        return "Produk laptop " + this.nama + " memiliki fitur AI yang dapat memudahkan pekerjaan";
    }    

}
