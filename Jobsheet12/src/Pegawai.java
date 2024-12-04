package Jobsheet12.src;

public class Pegawai {
    public String nip;
    public String nama;

    public Pegawai() {
        
    }
    
    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public void displayInfo() {
        System.out.println("NIP : " + this.nip);
        System.out.println("Nama : " + this.nama);
    }
}


