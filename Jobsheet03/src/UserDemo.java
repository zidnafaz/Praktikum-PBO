package Jobsheet03.src;

public class UserDemo {

    // public static void main(String[] args) {
    //     User user1 = new User();
    //     user1.displayInfo();
    // }

    public static void main(String[] args) {
        User user1 = new User("annisa.nadya", "annisa.nadya@gmail.com");
        user1.displayInfo();
    }

    // Pertanyaan Percobaan 1

    // 1. Fungsi constructor adalah sebuah wadah template ketika akan membuat objek baru.
    // Atau sebuah method khusus yang akan dipanggil ketika membuat objek baru
    // 2. Keistimewaan dari construktor adalah karena construktor tidak memerlukan tipe pengembalian
    // (return), construktor juga otomatis dipanggil ketika membuat objek baru
    // 3. Construktor dapat memiliki access level private namun karena private maka kita
    // tidak dapat membbuat objek diluar class tersebut
}
