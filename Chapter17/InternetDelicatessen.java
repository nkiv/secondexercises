import java.util.Scanner;

public class InternetDelicatessen{

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        double price = 0, delivery = 0, total = 0, yesNo = 0;

        

        String str;

        System.out.println("Enter the item:");
        str = scan.nextLine();

        System.out.println("Enter the price:");
        price = scan.nextDouble();

        System.out.println("Overnight delivery?: (0 = no) , (1 = yes)");
        yesNo = scan.nextDouble();

        if (price >= 1000){
            total = total + 200;
        }

        if (delivery == 1){
            total = total + 300;
        }

        total = total + price;

        System.out.println("Invoice: ");
        System.out.println(str + price);
        System.out.println("Delivery" + delivery);
        System.out.println("total" + total);
    }
}