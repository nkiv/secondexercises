import java.util.Scanner;

public class AreaOfACircle{

    public static void main(String [] args){
        String inData;
        Scanner scan = new Scanner ( System.in );

        System.out.println("Enter radius: ")
        inData = scan.nextLine();

        System.out.println("The area is: " + Math.PI*(inData*inData));
    }
}