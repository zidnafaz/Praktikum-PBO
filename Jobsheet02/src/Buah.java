public class Buah {

    public String nama;
    public String warna;
    public String rasa;
    public double stok;
    public double hargaPerKg;

    public double hitungBayar(double berat) {
        return berat * hargaPerKg;
    }

    public double updateStok(double berat) {
        return stok = stok - berat;
    }

    public double gantiHarga(double hargaBaru) {
        return hargaPerKg = hargaBaru;
    }

    public void displayInfo() {
        System.out.println("Nama          : " + nama);
        System.out.println("Warna         : " + warna);
        System.out.println("Rasa          : " + rasa);
        System.out.println("Stok          : " + stok);
        System.out.println("Harga Per Kg  : " + String.format("%.3f", hargaPerKg));
    }

    public void transaksi(double berat) {
        System.out.println("Nama          : " + nama);
        System.out.println("Warna         : " + warna);
        System.out.println("Berat         : " + berat);
        System.out.println("Total Bayar   : " + String.format("%.3f", hitungBayar(berat)));
        updateStok(berat);
    }
    
}
