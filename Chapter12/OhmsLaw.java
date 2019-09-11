import java.util.Scanner;

public class OhmsLaw{

    public static void main(String [] args){
        Scanner scan = new Scanner ( System.in );
        double I, V, R;

        System.out.println("Enter Voltage: ");
        V = scan.nextDouble();

        System.out.println("Enter Resistance: ");
        R = scan.nextDouble();

        I = (V + 0.0)/ R;

        System.out.println("The Amp is: " + I);
    }
}