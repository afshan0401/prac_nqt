package Inputs;
import java.util.Scanner;
public class Input1 {
    public static void main(String[] args) {
        
        
        
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] parts = line.split("\\s+");
        int[] arr = new int[parts.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(parts[i]);
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i < arr.length-1){
                System.out.print(" ");
            }
        }
    }

}
