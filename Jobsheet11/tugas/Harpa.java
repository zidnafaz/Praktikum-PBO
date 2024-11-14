package Jobsheet11.tugas;

public class Harpa extends AlatMusik implements AlatMusikPetik {
    
    private String jenisHarpa;
    private int jumlahSenar;

    public Harpa(String nama, int jumlahNada, String tahunRilis, String jenisHarpa, int jumlahSenar) {
        super(nama, jumlahNada, tahunRilis);
        this.jenisHarpa = jenisHarpa;
        this.jumlahSenar = jumlahSenar;
    }    

    @Override
    public void mainkan() {
        System.out.println("Dimainkan dengan dipetik");
    } 

    @Override
    public void tarikSenar() {
        System.out.println("Menarik senar");
    }

    @Override
    public void lepasSenar() {
        System.out.println("Melepas senar");
    }

    public String getJenisHarpa() {
        return jenisHarpa;
    }

    public void setJenisHarpa(String jenisHarpa) {
        this.jenisHarpa = jenisHarpa;
    }

    public int getJumlahSenar() {
        return jumlahSenar;
    }

    public void setJumlahSenar(int jumlahSenar) {
        this.jumlahSenar = jumlahSenar;
    }

}


