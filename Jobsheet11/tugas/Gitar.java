package Jobsheet11.tugas;

public class Gitar extends AlatMusik implements AlatMusikPetik {
    
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

    @Override
    public void tarikSenar() {
        System.out.println("Menarik senar");
    }

    @Override
    public void lepasSenar() {
        System.out.println("Melepas senar");
    }

}


