import java.util.Scanner;

public class Lag{

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        double hours, zones, depart, arrive, recover;

        System.out.println("How long did you travel?");
        hours = scan.nextDouble();
        System.out.println("How many zones did yo cross?");
        zones = scan.nextDouble();
        System.out.println("What time did you depart?");
        depart = scan.nextDouble();
        System.out.println("what time did you arrive?");
        arrive = scan.nextDouble();

        recover = (hours/2 + (zones -3) + depart + arrive )/10;

        System.out.println("you need to recover for " + recover + " days.");
    }
}