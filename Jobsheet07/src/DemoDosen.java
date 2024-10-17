package Jobsheet07.src;

public class DemoDosen {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();

        System.out.println("");

        dosen1.nama = "Yayan Ruhiyan";
        dosen1.nip = "34328970";
        dosen1.gaji = 3000000;
        dosen1.nidn = "19832432";

        System.out.println(dosen1.getAllInfo());

        Dosen dosen2 = new Dosen("34328970", "Yayan Ruhiyan", 3000000, "19832432");
        System.out.println(dosen2.getAllInfo());
    }
    
}
