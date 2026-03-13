
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        // int row = 4;
        // int col = 5;
        // int[][] arr = {
        //         { 1, 0, 1, 1, 0 },
        //         { 0, 0, 1, 0, 0 },
        //         { 1, 1, 1, 1, 0 },
        //         { 0, 1, 0, 1, 1 }
        // };

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col= sc.nextInt();
        int[][] arr  = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }



        int max = 0;
        int rowNo = -1;
        for (int i = 0; i < row; i++) {
            int count = 0;
            for (int j = 0; j < col; j++) {
                if(arr[i][j] == 1){
                    count++;
                }
            }
            if(count>max){
                max = count;
                rowNo = i+1; 
            }
        }
        System.out.println(rowNo);
    }
}
