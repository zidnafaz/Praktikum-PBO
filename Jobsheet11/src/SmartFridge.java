package Jobsheet11.src;

public class SmartFridge extends Kulkas implements Audible {
    
    private int volume;

    public SmartFridge(double harga, String warna, String merk, int jumlahPintu, int volume) {
        super(harga, warna, merk, jumlahPintu);
        this.volume = volume;
    }

    @Override
    public void naikkanVolume(int increment) {
        volume += increment;
        
    }

    @Override
    public void turunkanVolume(int decrement) {
        volume -= decrement;
        
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }    

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Volume          : " + volume);
    }
    
}


