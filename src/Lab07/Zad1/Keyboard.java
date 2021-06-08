package Lab07.Zad1;

import java.util.Scanner;

public class Keyboard {
    public int number;
    public int[] Get(int[] array){
        System.out.println("Enter values: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<array.length;i++)
        {
            System.out.println("Add value");
            int val = sc.nextInt();
            array[i] = val;
        }
        System.out.println("Numbers added");
        return array;
    }
}
