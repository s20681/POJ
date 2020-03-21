package Zjazd2;

public class ModelS extends Tesla {
    private int HP = 700;

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public static void engineOn(){
        System.out.println("Engine ON .. . .. ..");
    }

    public static void engineOff(){
        System.out.println("Engine OFF...... .. . . .. ");
    }

}
