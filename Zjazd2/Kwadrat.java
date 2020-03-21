package Zjazd2;

public class Kwadrat extends Ksztalt implements ShapeInterface{
    private int x;
    private int y;
    private double pole;

    public Kwadrat(int x, int y, final int iloscBokow) {
        super(iloscBokow);
        this.x = x;
        this.y = y;
    }

    public Kwadrat(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Kwadrat() {
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int value){
        this.x = value;
    }

    public void setY(int value){
        this.y = value;
    }

    public double calculate(){
        return x*y;
    }


}
