package Jobsheet04.src;

import java.time.LocalDate;

public class RumahSakitDemo {

    public static void main(String[] args) {

        Pegawai ani = new Pegawai("1234", "Dr. Ani");
        Pegawai bagus = new Pegawai("4567", "Dr. Bagus");

        Pegawai desi = new Pegawai("1234", "Ns. Desi");
        Pegawai eka = new Pegawai("4567", "Ns. Eka");

        Pasien pasien1 = new Pasien("343298", "Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 11), bagus, eka);

        System.out.println("================================================");
        System.out.println(pasien1.getInfo());
        System.out.println("================================================");

        Pasien pasien2 = new Pasien("997744", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
        
    }
    
}
