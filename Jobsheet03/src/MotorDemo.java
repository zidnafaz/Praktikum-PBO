package Jobsheet03.src;

public class MotorDemo {
    public static void main(String[] args) {
        // Motor motor1 = new  Motor();
        // motor1.platNomor = "B 0838 XZ";
        // int kecepatanBaru = 50;
        
        // if (!motor1.statusMesin && kecepatanBaru > 0) {
        //     System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        // } else {
        //     motor1.kecepatan = kecepatanBaru;
        // }

        // motor1.displayInfo();

        // Motor motor2 = new  Motor();
        // motor2.platNomor = "N 9840 AB";
        // motor2.statusMesin = true;
        // kecepatanBaru = 40;
        // motor2.displayInfo();

        // if (!motor2.statusMesin && kecepatanBaru > 0) {
        //     System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        // } else {
        //     motor2.kecepatan = kecepatanBaru;
        // }

        // Motor motor3 = new  Motor();
        // motor3.platNomor = "D 8343 CV";
        // kecepatanBaru = 60;
        
        // if (!motor3.statusMesin && kecepatanBaru > 0) {
        //     System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        // } else {
        //     motor3.kecepatan = kecepatanBaru;
        // }

        // motor3.displayInfo();

        Motor motor1 = new Motor();
        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50);
        motor1.displayInfo();

        Motor motor2 = new Motor();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setStatusMesin(true);
        motor2.setKecepatan(40);
        motor2.displayInfo();

        Motor motor3 = new Motor();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayInfo();
        
        // Pertanyaan Percobaan 2
        // 1. Karena program menjalankan memthod setKecepatan() terlebih dahulu kemudian
        // menjalankan method displayInfo().
        // 2. Agar nilai atribute tidak diubah secara sembarangan, namun hanya bisa melalui
        // setter dan getter
        // 3. Setter berfungsi untuk mengisi nilai atribute (write), sedangkan Getter berfungsi
        // untuk mengambil atau membaca nilai atribute (read).
        // 

    }
}
