import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //byte, short,int, long, double, float,char, boolean - primitive

        // i++ si ++1;

        int x =10;
        if (x == 10) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        //Loops
        //for, foreachn- bucla repetitiva cu numar cunoscut de pasi
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
        //do while(), while - bucle repetitive cu nr necunoscut de pasi
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while(number !=0){
            System.out.println(number);
            number = scanner.nextInt();
        }
    }

}