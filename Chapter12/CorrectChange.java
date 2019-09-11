import java.util.Scanner;

public class CorrectChange{

    public static void main(String [] args){
        Scanner scan = new Scanner( System.in );
        int dollar, quarter, dime, nickle, penny, cent;

        System.out.println("Enter Cents:");
        cent = scan.nextInt();

        dollar = cent / 100;
        quarter = (cent - (dollar * 100)) / 25;
        dime = (cent- (dollar * 100) - (quarter * 25)) / 10;
        nickle = (cent - (dollar * 100) - (quarter * 25) - (dime * 10))/5;
        penny = (cent - (dollar * 100) - (quarter * 25) - (dime * 10) - (nickle *5))/1;

        System.out.println("The ammount of dollars: " + dollar + ". The Ammount of quarters: " + quarter + ". The ammount of dimes: " + dime + ". The ammount of nickles: " + nickle + ". The ammount of pennies: " + penny);
    }
}