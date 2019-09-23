import java.util.Scanner;

public class AddingInts{
    
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int countNumb = 0, sum = 0, input = 0;

        System.out.println("How many integers will be added?");
        countNumb = scan.nextInt();

        while(countNumb > 0){
            System.out.println("Enter an integer:");
            input = scan.nextInt();
            sum = sum + (input);
            countNumb--;
        }

        System.out.println("The sum is " + sum);
    }
}