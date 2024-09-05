public class PersegiPanjang {

    public int panjang;
    public int lebar;

    public int getLuas() {
        return panjang * lebar;
    }

    public int getKeliling() {
        return (panjang * 2) + (lebar * 2);
    }

    public void displayInfo() {
        System.out.println("Panjang     : " + panjang);
        System.out.println("Lebar       : " + lebar);
    }

}
