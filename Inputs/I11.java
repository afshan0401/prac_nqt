package Inputs;

import java.util.Scanner;

public class I11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        String[] l1 = line1.trim().split("\\s+");
        String[] l2 = line2.trim().split("\\s+");

        int[] line1Nums = new int[l1.length];
        int[] line2Nums = new int[l2.length];

        for (int i = 0; i < l1.length; i++) {
            line1Nums[i] = Integer.parseInt(l1[i]);
        }
        for (int i = 0; i < l2.length; i++) {
            line2Nums[i] = Integer.parseInt(l2[i]);
        }

        for (int i = 0; i < line1Nums.length; i++) {
            System.out.print(line1Nums[i]);
            if(i< line1Nums.length-1){
                System.out.print(" ");
            }
        }
        System.out.print(" ");

        for (int i = 0; i < line2Nums.length; i++) {
            System.out.print(line2Nums[i]);
            if(i< line2Nums.length-1){
                System.out.print(" ");
            }
        }
    }
}
