package Jobsheet12.src;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        
        Pegawai pegawai3 = new Pegawai();
        Dosen dosen3 = (Dosen) pegawai3;
        
        // Pegawai pegawai1 = dosen1;
        
        // System.out.println(pegawai1.nip);
        // System.out.println(pegawai1.nama);
        // pegawai1.displayInfo();

        // Dosen newDosen = (Dosen) pegawai1;

        // System.out.println(newDosen.nama);
        // System.out.println(newDosen.nidn);
        // newDosen.mengajar();

        // System.out.println(pegawai1.nip);
        // System.out.println(pegawai1.nama);
        // System.out.println(pegawai1.nidn);
        // pegawai1.mengajar();

        // System.out.println(dosen1.nip);
        // System.out.println(dosen1.nama);
        // System.out.println(dosen1.nidn);
        // dosen1.mengajar();

        // Dosen dosen2 = new Dosen("19700105", "Muhammad, S.T, M.T", "197001");
               
        // TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika, S.T.", "Tenaga Laboratorium");

        // ArrayList<Pegawai> daftarPegawai = new ArrayList<Pegawai>();

        // daftarPegawai.add(dosen1);
        // daftarPegawai.add(dosen2);
        // daftarPegawai.add(tendik1);
        // daftarPegawai.add(tendik2);

        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
        TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");
        
        train(dosen1);
        train(tendik1);
    }

    public static void train(Pegawai pegawai) {
        pegawai.displayInfo();
        System.out.println("Mengenalkan lingkungan kampus");
        System.out.println("Menginfokan SOP/Juknis");

        if (pegawai instanceof Dosen) {
            System.out.println("Memberi pelatihan pedagogik");
        }
    }

    // public static void train(Pegawai pegawai) {
    //     System.out.println("Memberi pelatihan untuk pegawai");
    //     pegawai.displayInfo();

    //     // test
    //     System.out.println(pegawai.nidn);
    //     System.out.println(pegawai.kategori);
    //     pegawai.mengajar();
    // }

}
