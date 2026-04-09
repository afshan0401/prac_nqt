package Inputs;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] str = s.split("\\s+");
        int[] arr = new int[len];

        for(int i=0;i<len;i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        for(int i=0;i<len;i++){
            System.out.print(arr[i]);
            if(i < arr.length-1){
                System.out.print(",");
            }
        }
    }
}
