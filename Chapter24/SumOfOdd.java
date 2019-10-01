import java.util.Scanner;

public class SumOfOdd{

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input an odd number");
        int n = scan.nextInt();

        int totalSum = 0;

        int nsq = n*n;

        for(int odd = 0; odd<=n; odd+=2){
            totalSum+=odd;
        }
        System.out.println("The sum is " + totalSum);
        System.out.println("N Squared is " + nsq);
    }
}