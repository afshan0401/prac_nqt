package Inputs;

import java.util.Scanner;

public class I10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l1 = sc.nextLine();
        String l2 = sc.nextLine();

        String[] l11 = l1.trim().split("\\s+");
        String[] l12 = l2.trim().split("\\s+");

        int[] num1 = new int[l11.length];
        int[] num2 = new int[l12.length];

        for (int i = 0; i < num1.length; i++) {
            num1[i] = Integer.parseInt(l11[i]);
        }
        for (int i = 0; i < num2.length; i++) {
            num2[i] = Integer.parseInt(l12[i]);
        }


        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i]);
            if(i< num1.length-1){
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int i = 0; i < num2.length; i++) {
            System.out.print(num2[i]);
            if(i< num2.length-1){
                System.out.print(" ");
            }
        }


    }
}
