package Jobsheet04.srcTugas;

public class Transaksi {
    
    private Karyawan kasir;
    private Karyawan petugasCuci;
    private double berat;

    public Karyawan getKasir() {
        return kasir;
    }

    public void setKasir(Karyawan kasir) {
        this.kasir = kasir;
    }

    public Karyawan getPetugasCuci() {
        return petugasCuci;
    }

    public void setPetugasCuci(Karyawan petugasCuci) {
        this.petugasCuci = petugasCuci;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public String getInfo() {
        String info = "";
        
        info += "\nBerat           : " + berat;
        info += "\nKasir           : " + kasir.getInfo();
        info += "\nPetugas Cuci    : " + petugasCuci.getInfo();

        return info;
    }

}
