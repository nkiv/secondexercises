import java.util.Scanner;

public class OrderChecker{

    public static void main(String [] args){

        int boltCost, nutCost, washerCost, bolt, nut, washer, orderCost;
        boltCost = 5;
        nutCost = 3;
        washerCost = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Number of bolts:");
        bolt = scan.nextInt();
        System.out.println("Number of nuts:");
        nut = scan.nextInt();
        System.out.println("Number of washers:");
        washer = scan.nextInt();

        System.out.println("Number of bolts: " + bolt);
        System.out.println("Number of nuts: " + nut);
        System.out.println("Number of washers: " + washer);

        if (!washer*2>=bolt){
            System.out.println("Check the order: too few washers");
        } else if(!nut>=bolt){
                System.out.println("Check the order: too few nuts");
            }else{
        System.out.println("Order looks spick and span!");
                }
        orderCost = (boltCost*bolt)+(nutCost*nut)+(washerCost*washer);

        System.out.println("Order Cost:" + orderCost);
    }
}