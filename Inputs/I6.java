package Inputs;

import java.util.Scanner;

public class I6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.trim().split(",");
        int[] arr = new int[str.length];

        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(str[i].trim());
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i < arr.length-1){
                System.out.print("-");
            }
        }
    }
}
