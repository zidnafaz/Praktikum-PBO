package Jobsheet11.src;

public class DemoAlatElektronik {
    public static void main(String[] args) {

        header();
        System.out.println("                 Kipas      ");
        header();
        Kipas kipas1 = new Kipas(500000, "Hitam", "Panasonic", "Tipe A");
        kipas1.displayInfo();
        header();
        Kipas kipas2 = new Kipas(700000, "Putih", "Maspion", "Tipe B");
        kipas2.displayInfo();

        header();
        System.out.println("                 Kulkas      ");
        header();
        Kulkas kulkas1 = new Kulkas(2500000, "Hitam", "Panasonic", 2);
        kulkas1.displayInfo();
        header();
        Kulkas kulkas2 = new Kulkas(3000000, "Biru", "Sharp", 4);
        kulkas2.displayInfo();

        header();
        System.out.println("              Smart Fridge      ");
        header();
        SmartFridge fridge1 = new SmartFridge(9500000, "Abu", "Samsung", 4, 100);
        fridge1.displayInfo();
        header();
        SmartFridge fridge2 = new SmartFridge(9800000, "Merah", "LG", 4, 200);
        fridge2.displayInfo();

        header();
        System.out.println("                   TV      ");
        header();
        Tv tv1 = new Tv(3000000, "Hitam", "Panasonic", "LED", 50);
        tv1.displayInfo();
        header();
        Tv tv2 = new Tv(6000000, "Putih", "Sharp", "OLED", 100);
        tv2.displayInfo();
        header();

    }

    public static void header() {
        int length = 40;
        for (int i = 0; i < length; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
