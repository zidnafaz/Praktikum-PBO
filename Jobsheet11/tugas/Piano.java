package Jobsheet11.tugas;

public class Piano extends AlatMusik {
    
    private String pedal;
    private String warna;

    public Piano() {

    }

    public Piano(String nama, int jumlahNada, String tahunRilis, String pedal, String warna) {
        super(nama, jumlahNada, tahunRilis);
        this.pedal = pedal;
        this.warna = warna;
    }

    public String getPedal() {
        return pedal;
    }
    
    public void setPedal(String pedal) {
        this.pedal = pedal;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pedal        : " + pedal);
        System.out.println("Warna        : " + warna);
    }

    public void mainkan() {
        System.out.println("Dimainkan dengan menekan keyboard dan pedal");
    }

}


