
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int noOfStops = sc.nextInt();
        int[][] offOnn = new int[noOfStops][2];
        
        for (int i = 0; i < noOfStops; i++) {
            
            offOnn[i][0] = sc.nextInt();
            offOnn[i][1] = sc.nextInt();
        }

        int totalInBus = 0;
        int max = 0;
        for (int i = 0; i < noOfStops; i++) {
            totalInBus += offOnn[i][1] - offOnn[i][0];
            max = Math.max(max, totalInBus);
        }

        System.out.println(max);

    }
}
