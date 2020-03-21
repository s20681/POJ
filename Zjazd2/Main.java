package Zjazd2;

public class Main {
    public static void main(String[] args) {
        Kwadrat a = new Kwadrat(2,2);

        Kwadrat b = new Kwadrat();
        b.setX(2);
        b.setY(4);

        ModelS moje_auto = new ModelS();
        moje_auto.setDrzwi(5);
        moje_auto.setKierownica(true);
        moje_auto.setKola(4);

        System.out.println(moje_auto.getDrzwi());
        System.out.println(moje_auto.getKola());
        System.out.println(moje_auto.getKierownica());

        System.out.println(moje_auto.getLadowarka());
        moje_auto.laduj();

        System.out.println(moje_auto.getHP());
        moje_auto.engineOn();
        moje_auto.engineOff();


    }
}
