import java.util.Scanner;

public class HarmonicMean{

    public static void main(String [] args){
        Scanner scan = new Scanner( System.in );
        double x, y;

        double aMean, hMean;

        System.out.println("Enter X:");
        x = scan.nextDouble();

        System.out.println("Enter Y:");
        y = scan.nextDouble();

        aMean = (x + y)/2;
        hMean = 2/((1/x)+(1/y));

        System.out.println("Arithmetic Mean: " + aMean);
        System.out.println("Harmonic Mean: " + hMean);
    }
}