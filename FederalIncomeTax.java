import java.util.Scanner;

public class FederalIncomeTax{

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        double percentTax, userInput, totalPaid = 0, a, b, c, d, e;

        System.out.println("Enter your yearly income (Dollars):");
        userInput = scan.nextInt();

        a = userInput * 0;
        b = userInput * .1;
        c = userInput * .16;
        d = userInput * .19;
        e = userInput * .22;

        if(userInput >= 105000){
            totalPaid = a + b + c + d + e;
        } else if(105000 > userInput && userInput >= 65000){
            totalPaid = a + b + c + d;
        } else if(65000 > userInput && userInput >= 35000){
            totalPaid = a + b + c;
        } else if(35000 > userInput && userInput >= 15000){
            totalPaid = a + b;
        } else if(15000 > userInput && userInput >= 0){
            totalPaid = a;
        }else{
            System.out.println("You must imput a value!");
        }
        
        percentTax = (totalPaid/userInput)* 100;

        System.out.println("Total paid: " + totalPaid);

        System.out.println(percentTax + " of " + userInput);
    }
}