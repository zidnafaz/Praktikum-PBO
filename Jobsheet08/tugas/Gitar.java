package Jobsheet08.tugas;

public class Gitar extends AlatMusik {
    
    private String jenisGitar;
    private int jumlahSenar;

    public Gitar() {

    }

    public Gitar(String nama, int jumlahNada, String tahunRilis, String jenisGitar, int jumlahSenar) {
        super(nama, jumlahNada, tahunRilis);
        this.jenisGitar = jenisGitar;
        this.jumlahSenar = jumlahSenar;
    }

    public String getJenisGitar() {
        return jenisGitar;
    }

    public void setJenisGitar(String jenisGitar) {
        this.jenisGitar = jenisGitar;
    }

    public int getJumlahSenar() {
        return jumlahSenar;
    }

    public void setJumlahSenar(int jumlahSenar) {
        this.jumlahSenar = jumlahSenar;
    }

    public void mainkan() {
        System.out.println("Dimainkan dengan dipetik");
    }   

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis Gitar  : " + jenisGitar);
        System.out.println("Jumlah Senar : " + jumlahSenar);
    }

}


