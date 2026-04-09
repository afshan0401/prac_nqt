package NQT2026;

import java.util.Scanner;

public class DiscountCalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double finalPrice = discounts(price);
        System.out.printf("final price: %.2f", finalPrice);
    }

    public static double discounts(double price){
        double discount = 0;
        if(price < 1000 && price>0){
            discount = 0.95 * price;
        }
        else if(price >= 1000 && price<5000){
            discount = 0.9 * price;
        }
        else if(price >= 5000){
            discount = 0.85 * price;
        }

        return discount;
    }

}
