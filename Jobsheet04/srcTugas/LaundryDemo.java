package Jobsheet04.srcTugas;

public class LaundryDemo {

    public static void main(String[] args) {

        Karyawan ola = new Karyawan(31, "Ola", "08563243824");
        Karyawan umar = new Karyawan(32, "Umar", "08573829742");

        Karyawan imam = new Karyawan(41, "Imam", "08562414342");
        Karyawan ajeng = new Karyawan(42, "Ajeng", "08574324325");

        Pelanggan p1 = new Pelanggan(4231, "Willy", "Jl. Senggani");
        p1.tambahTransaksi(3.5, imam, umar);
        p1.tambahTransaksi(2., ajeng, ola);
        System.out.println("=======================================================");
        System.out.println(p1.getInfo());
        System.out.println("=======================================================");
        
        Pelanggan p2 = new Pelanggan(4232, "Anita", "Jl. Manggis");
        p2.tambahTransaksi(1.8, imam, ola);
        System.out.println(p2.getInfo());
        System.out.println("=======================================================");
        
        Pelanggan p3 = new Pelanggan(4233, "Salman", "Jl. Mangga");
        System.out.println(p3.getInfo());
        System.out.println("=======================================================");

    }

}
