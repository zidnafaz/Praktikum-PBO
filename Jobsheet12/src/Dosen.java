package Jobsheet12.src;

public class Dosen extends Pegawai implements Comparable<Dosen> {
    public String nidn;

    public Dosen() {

    }

    public Dosen(String nip, String nama, String nidn) {
        super(nip, nama);
        this.nidn = nidn;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIDN : " + this.nidn);
    }

    public void mengajar() {
        System.out.println("Membuat rencana pembelajaran");
        System.out.println("Menyusun materi");
        System.out.println("Melakukan evaluasi");
        System.out.println("Melaksanakan PBM");
    }

    @Override
    public int compareTo(Dosen otherDosen) {        
        return this.nama.compareTo(otherDosen.nama);
    }
}


