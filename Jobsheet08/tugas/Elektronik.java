package Jobsheet08.tugas;

public class abstract Elektronik {

    public String model;
    public String nama;
    public String tahunRilis;

    public Elektronik() {

    }

    public Elektronik(String model, String nama, String tahunRilis) {
        this.model = model;
        this.nama = nama;
        this.tahunRilis = tahunRilis;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getTahunRilis() {
        return tahunRilis;
    }
    public void setTahunRilis(String tahunRilis) {
        this.tahunRilis = tahunRilis;
    }    

    public String getInfo() {
        String info = "";

        info += "Model          : " + model + "\n";
        info += "nama           : " + nama + "\n";
        info += "Tahun Rilis    : " + tahunRilis + "\n";

        return info;
    }

    public abstract String getFeature() {
        return "Produk ini tidak memiliki fitur khusus";
    }
    
}
