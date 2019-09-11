import java.util.Scanner;

public class DistanceTravel{

    public static void main(String [] args){
        double t;
        double g = 32.174;
        Scanner scan = new Scanner( System.in );

        System.out.println("Enter the number of seconds:");
        t = scan.nextDouble();

        double d = (0.5)*g*(t*t);

        System.out.println("Distance: " + d);
    }
}