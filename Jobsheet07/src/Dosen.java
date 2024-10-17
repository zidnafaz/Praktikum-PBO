package Jobsheet07.src;

public class Dosen extends Pegawai {

    public String nidn;

    public Dosen() {
        System.out.println("Objek dari class Dosen dibuat");
    }

    // public Dosen(String nip, String nama, double gaji, String nidn) {
    //     System.out.println("Obek dari class Dosen dibuat dengan constructor berparameter");
    // }
    
    // public Dosen(String nip, String nama, double gaji, String nidn) {
    //     this.nip = nip;
    //     this.nama = nama;
    //     this.gaji = gaji;
    //     this.nidn = nidn;
    // }

    // public Dosen(String nip, String nama, double gaji, String nidn) {
    //     super.nip = nip;
    //     super.nama = nama;
    //     super.gaji = gaji;
    //     this.nidn = nidn;
    // }   

    // public Dosen(String nip, String nama, double gaji, String nidn) {
    //     super();
    //     super.nip = nip;
    //     super.nama = nama;
    //     super.gaji = gaji;
    //     this.nidn = nidn;
    // }

    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
        this.nidn = nidn;
    }

    // public Dosen(String nip, String nama, double gaji, String nidn) {
    //     this.nidn = nidn;
    //     super(nip, nama, gaji);
    // }

    // public String getAllInfo() {
    // String info = "";

    // info += "NIP : " + nip + "\n";
    // info += "Nama : " + nama + "\n";
    // info += "Gaji : " + gaji + "\n";
    // info += "NIDN : " + nidn + "\n";

    // return info;
    // }

    // public String getAllInfo() {
    // String info = "";

    // info += "NIP : " + this.nip + "\n";
    // info += "Nama : " + this.nama + "\n";
    // info += "Gaji : " + this.gaji + "\n";
    // info += "NIDN : " + this.nidn + "\n";

    // return info;
    // }

    // public String getAllInfo() {
    // String info = "";

    // info += "NIP : " + super.nip + "\n";
    // info += "Nama : " + super.nama + "\n";
    // info += "Gaji : " + super.gaji + "\n";
    // info += "NIDN : " + super.nidn + "\n";

    // return info;
    // }

    // public String getAllInfo() {
    // String info = "";

    // info += "NIP : " + super.nip + "\n";
    // info += "Nama : " + super.nama + "\n";
    // info += "Gaji : " + super.gaji + "\n";
    // info += "NIDN : " + this.nidn + "\n";

    // return info;
    // }

    // public String getAllInfo() {
    // String info = getInfo();

    // info += "NIDN : " + nidn + "\n";

    // return info;
    // }

    // public String getAllInfo() {
    // String info = this.getInfo();

    // info += "NIDN : " + nidn + "\n";

    // return info;
    // }

    public String getAllInfo() {
        String info = super.getInfo();

        info += "NIDN   : " + nidn + "\n";

        return info;
    }

    public String getInfo() {
        return "NIDN   : " + this.nidn + "\n";
    }

}
