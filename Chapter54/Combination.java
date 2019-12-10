import java.util.Scanner;

public class Combination{

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("---Combinations---");
        System.out.println("Input the value N: "); 
        int N = scan.nextInt();

        if(N > 20){
            System.out.println("ERROR! N must be smaller than 20.");
            System.out.println("-----------------------------------");
        } 
            System.out.println("Input the value R:");
            int R = scan.nextInt();
        if(R > 20){
            System.out.println("ERROR! R must be smaller than 20.");
        }
        
        int combo = (R*(N-R)/N);

        if(combo < 0){
            System.out.println("NON REAL NUMBER!");
        }else{
            System.out.println("The Combination of nCr is " + combo);
        }
    }
}