public class BuahDemo {

    public static void main(String[] args) {
        Buah buah1 = new Buah();

        buah1.nama = "Apple";
        buah1.warna = "Hijau";
        buah1.rasa = "Manis";
        buah1.stok = 10;
        buah1.hargaPerKg = 18.000;

        System.out.println("\nBuah 1\n");

        buah1.displayInfo();

        System.out.println("\nSimulasi Transaksi\n");

        buah1.transaksi(3);

        System.out.println("\nCek Stok Buah 1 Setelah Transaksi\n");
        buah1.displayInfo();

        Buah buah2 = new Buah();

        buah2.nama = "Strawberry";
        buah2.warna = "Merah";
        buah2.rasa = "Manis Asam";
        buah2.stok = 15;
        buah2.hargaPerKg = 25.000;

        System.out.println("\nBuah 2\n");

        buah2.displayInfo();

        System.out.println("\nUpdate Harga\n");

        buah2.gantiHarga(30.000);
        buah2.displayInfo();
    }
    
}
    