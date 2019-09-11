import java.util.Scanner;

public class DiscountPrices{

    public static void main(String [] args){
        double discount, userImput;
        Scanner scan = new Scanner( System.in );

        System.out.println("Enter amount of purchases:");
        userImput = scan.nextDouble();

        if (userImput > 1000.00){
            discount = userImput-(userImput*.1);
            System.out.println("Discounted price: " + discount);
        } else{
            System.out.println("Sorry! There is no discount");
        }
    }
}