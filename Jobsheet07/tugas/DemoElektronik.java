package Jobsheet07.tugas;

public class DemoElektronik {
    public static void main(String[] args) {

        header();
        System.out.println("           Elektronik Laptop      ");
        header();
        
        Laptop laptop1 = new Laptop("Chromebook", "Chromebook 4", "2024", "Intel Celeron N4020", "4 Gb", "32 Gb");
        System.out.println(laptop1.getAllInfo());
        header();
        
        Laptop laptop2 = new Laptop("Workstation", "Samsung Book 7", "2023", "AMD Ryzen 7 8845HS", "32 Gb", "1 Tb");
        System.out.println(laptop2.getAllInfo());
        System.out.println(laptop2.getFeature());
        header();

        System.out.println("           Elektronik Kulkas      ");
        header();

        Kulkas kulkas1 = new Kulkas("Multi-Door", "Samsung French-Door", "2022", 4, "130 Watt", "511 Liter");
        System.out.println(kulkas1.getAllInfo());
        header();

        Kulkas kulkas2 = new Kulkas("Top-Freezer", "Samsung RT22", "2021", 2, "100 Watt", "255 Liter");
        System.out.println(kulkas2.getAllInfo());
        System.out.println(kulkas2.getFeature());
        header();

    }

    public static void header() {
        int length = 40;
        for (int i = 0; i < length; i++) {
            System.out.print("=");
        }
        System.out.println("");
    }
}
