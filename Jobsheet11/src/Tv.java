package Jobsheet11.src;

public class Tv extends AlatElektronik implements Audible {
    
    private String jenisLayar;
    private int volume;

    public Tv(double harga, String warna, String merk, String jenisLayar, int volume) {
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
    }

    public String getJenisLayar() {
        return jenisLayar;
    }

    public void setJenisLayar(String jenisLayar) {
        this.jenisLayar = jenisLayar;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
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

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis Layar     : " + jenisLayar);
        System.out.println("Volume          : " + volume);
    }

}


