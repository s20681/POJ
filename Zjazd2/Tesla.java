package Zjazd2;

public class Tesla extends Samochod implements TeslaInterface{
    private boolean ladowarka = true;

    public boolean getLadowarka() {
        return ladowarka;
    }

    public void setLadowarka(boolean ladowarka) {
        this.ladowarka = ladowarka;
    }

    public void charge(){
        System.out.println("Laduje....... ...... ... ... .. .");
    }

}
