import java.util.Scanner;

public class AnnualCost{

    public static void main(String [] args){
        double cents, hours, cost;
        Scanner scan = new Scanner( System.in );

        System.out.println("Enter Cost per Kilowatt-hour in cents:");
        cents = scan.nextDouble();

        System.out.println("Enter Kilowatt-hour used per year:");
        hours = scan.nextDouble();

        cost = (cents*.01)*hours;

        System.out.println("Annual Cost: " + cost);
    }
}