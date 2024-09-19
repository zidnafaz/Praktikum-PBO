package Jobsheet04.srcTugas;

import java.util.ArrayList;

public class Pelanggan {
    
    private int noPelanggan;
    private String nama;
    private String alamat;
    private ArrayList<Transaksi> riwayatTransaksi;
    
    public Pelanggan(int noPelanggan, String nama, String alamat) {
        this.noPelanggan = noPelanggan;
        this.nama = nama;
        this.alamat = alamat;
        this.riwayatTransaksi = new ArrayList<Transaksi>();
    }

    public int getNoPelanggan() {
        return noPelanggan;
    }

    public void setNoPelanggan(int noPelanggan) {
        this.noPelanggan = noPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void tambahTransaksi(double berat, Karyawan kasir, Karyawan petugasCuci) {
        Transaksi transaksi = new Transaksi();
        transaksi.setBerat(berat);
        transaksi.setKasir(kasir);
        transaksi.setPetugasCuci(petugasCuci);
        riwayatTransaksi.add(transaksi);        
    }

    public String getInfo() {
        String info = "";

        info += "No Pelanggan       : " + this.noPelanggan;
        info += "\nNama Pelanggan     : " + this.nama;

        if (!riwayatTransaksi.isEmpty()) {

            info += "\n=======================================================\n";
            info += "                  RIWAYAT TRANSAKSI";
            info += "\n=======================================================";
            
            for (Transaksi transaksi : riwayatTransaksi) {
                info += transaksi.getInfo();
                info += "\n-------------------------------------------------------\n";
            }
            
        } else {
            
            info += "\n\nMaaf kamu belum melakukan transaksi";
            
        }

        return info;
    }

}
