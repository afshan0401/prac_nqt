package Inputs;

import java.util.Scanner;

public class I9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        String[] fruits = line.split("\\s+");

        for(String s: fruits){
            System.out.println(s);
        }

    }
}
