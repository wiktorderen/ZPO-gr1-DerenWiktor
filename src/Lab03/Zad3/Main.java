package Lab03.Zad3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Type in 0: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ch;
        if(n!=0) {
            System.out.printf("Type in 0: ");
            n = sc.nextInt();
        }

        if(n==0) {
            System.out.println("What numbers program should read?");
            System.out.println("Numbers greater than zero -> type 1");
            System.out.println("Numbers divisible by two -> type 2");
            System.out.println("Number three -> type 3");
            ch = sc.nextInt();
            Objects objects = new Objects();
            objects.chooseObserver(ch);
            System.out.println("You have chosen observer number "+ch);
        }
    }
}
