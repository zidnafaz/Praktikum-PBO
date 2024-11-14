package Jobsheet11.tugas;

public abstract class AlatMusik {
    
    public String nama;
    public int jumlahNada;
    public String tahunRilis;

    public AlatMusik() {

    }
    
    public AlatMusik(String nama, int jumlahNada, String tahunRilis) {
        this.nama = nama;
        this.jumlahNada = jumlahNada;
        this.tahunRilis = tahunRilis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahNada() {
        return jumlahNada;
    }

    public void setJumlahNada(int jumlahNada) {
        this.jumlahNada = jumlahNada;
    }

    public String getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(String tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public void displayInfo() {
        System.out.println("Nama         : " + nama);
        System.out.println("Jumlah Nada  : " + jumlahNada);
        System.out.println("Tahun Rilis  : " + tahunRilis);
    }

    public abstract void mainkan();    

}


