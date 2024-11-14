package Jobsheet11.tugas;

public class DemoAlatMusik {
    public static void main(String[] args) {
        
        header();
        System.out.println("            Alat Musik Piano      ");
        header();

        Piano piano1 = new Piano("Yamaha P-525", 88, "2023", "Ada", "Hitam");
        piano1.displayInfo();
        piano1.mainkan();
        header();

        header();
        System.out.println("            Alat Musik Gitar      ");
        header();

        Gitar gitar1 = new Gitar("Yamaha LL16D-ARE", 12, "2014", "Akustik", 12);
        gitar1.displayInfo();
        gitar1.mainkan();
        gitar1.lepasSenar();
        header();

        header();
        System.out.println("            Alat Musik Harpa      ");
        header();

        Harpa harpa1 = new Harpa("Harpa", 7, "2012", "Harpa Caltic", 47);
        harpa1.displayInfo();
        harpa1.mainkan();
        harpa1.tarikSenar();
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


