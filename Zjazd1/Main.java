package Zjazd1;

public class Main {
    public static void main(String[] args) {
//        int myFirstNumber = 35;
//        int mySecondNumber = 12;
//        int myThirdNumber = myFirstNumber + mySecondNumber;
//        System.out.println(myThirdNumber);
//
//        byte byteMax = Byte.MAX_VALUE;
//        byte byteMin = Byte.MIN_VALUE;
//        System.out.println("Byte max = " + byteMax);
//        System.out.println("Byte min = " + byteMin);
//
//        short shortMax = Short.MAX_VALUE;
//        short shortMin = Short.MIN_VALUE;
//        System.out.println("Short max = " + shortMax);
//        System.out.println("Short min = " + shortMin);
//
//        int intMax = Integer.MAX_VALUE;
//        int intMin = Integer.MIN_VALUE;
//        System.out.println("Integer max = " + intMax);
//        System.out.println("Integer min = " + intMin);

//        Zad1();
        Zad2();
    }

    public static void Zad1(){
        byte var1 = 127;
        short var2 = 32767;
        int var3 = 2147483647;
        long var = (long) (50000 + 10*(var1 + var2 + var3));
        System.out.println(var);
    }

    public static void Zad2(){
        double var1 = 20;
        double var2 = 40;
        double suma = (var1 + var2)*100;
        boolean bool_var = (suma*100)%40.00d == 0;

        if(bool_var){
            System.out.println("Reszta wynosi zero");
        }else{
            System.out.println("Reszta wieksza od zera");
        }
    }

}
