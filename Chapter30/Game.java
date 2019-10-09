import java.util.*;

public class Game{

    public static void main(String [] args){

        Random num = new Random();
        int randNumb = num.nextInt(10)+1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Guess the number im thinking, from one to 10. You have three tries loser");

        boolean correct = false;
        for(int guess = 3; guess>0; guess--){
            System.out.println("Guess correctly");
            int numb = scan.nextInt();
            if(numb == randNumb){
                System.out.println("Great Guess!\t You win!");
                correct = true;
                guess = 0;
            }else{
                System.out.println("IDIOT!");
            }
        }
        if(!correct){
            System.out.println("You suck loser");
            System.out.println("Gobble my cheeks " + randNumb);
        }

    }
}