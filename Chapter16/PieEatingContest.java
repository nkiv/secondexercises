import java.util.Scanner;

public class PieEatingContest{

    public static void main(String [] args){

    Scanner scan = new Scanner(System.in);
    int userWeight;

    System.out.println("What is your weight?");
    userWeight = scan.nextInt();

    if(280 >= userWeight && userWeight >= 220){
        System.out.println("Have a fun contest!");
        } else{
            System.out.println("YOU DUMB IDIOT!");
        }
    }
}