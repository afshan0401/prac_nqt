package Inputs;

import java.util.Scanner;

public class I7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        String name = sc.nextLine();
        
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if(i < n-1){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(name);


    }
}
