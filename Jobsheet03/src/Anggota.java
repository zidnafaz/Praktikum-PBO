package Jobsheet03.src;

public class Anggota {
    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String noKtp, String nama, int limitPinjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public int pinjam(int nominalPinjam) {
        if (nominalPinjam > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman = jumlahPinjaman + nominalPinjam;
        }
        return jumlahPinjaman;
    }

    public int angsur(int nominalAngsur) {
        double minimalAngsur = 0.1 * jumlahPinjaman;

        if (nominalAngsur > limitPinjaman) {
            System.out.println("Maaf, uang kamu kelebihan");
        } else if (nominalAngsur < minimalAngsur) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            jumlahPinjaman = jumlahPinjaman - nominalAngsur;
        }
        return jumlahPinjaman;
    }

    // public int angsur(int nominalAngsur) {

    //     if (nominalAngsur > limitPinjaman) {
    //         System.out.println("Maaf, uang kamu kelebihan");
    //     } else {
    //         jumlahPinjaman = jumlahPinjaman - nominalAngsur;
    //     }
    //     return jumlahPinjaman;
    // }

}
