import java.util.Scanner;

public class Cents{

    public static void main(String [] args){

        Scanner scan = new Scanner ( System.in );
        double cents, dollar;

        System.out.println("Enter Cents:");
        cents = scan.nextDouble();
        dollar = cents*.01;

        System.out.println("Dollars of " + cents + " is " + dollar);
    }
}