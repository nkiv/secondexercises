import java.util.Scanner;

public class InternetDelicatessen{

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        double item, price, delivery, total;

        System.out.println("Enter the item:");
        item = scan.nextDouble();

        System.out.println("Enter the price:");
        price = scan.nextDouble();

        System.out.println("Overnight delivery?: (0 = no) , (1 = yes)");
        item = scan.nextDouble();

        if (price >= 1000){
            total = total + 200;
        }

        if (delivery == 1){
            total = total + 300;
        }

        total = total + price;

        
    }
}