package NQT2026;
import java.util.Scanner;


public class ParkingFineCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int fine = 0;
        if(hours<=2 && hours>0){
            fine = 50;
        }
        else if(hours<=5 && hours>2){
            fine = 100;
        }
        else if(hours>5){
            fine = 20;
        }

        System.out.print("Fine: "+fine);
    }
}
