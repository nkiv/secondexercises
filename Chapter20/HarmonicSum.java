import java.util.Scanner;

    public class HarmonicSum{

        public static void main(String [] args){
            Scanner scan = new Scanner(System.in);
            
            double sum = 0, n = 0;

            System.out.println("Enter an integer limit:");
            n = scan.nextDouble();

            while(n>0){
                sum = sum +(1.0/(n));
                n--;
            }

            System.out.println("Sum is: " + sum);
        }
    }