import java.util.Scanner;

public class Odious{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        boolean process = true;
        System.out.println("Type a number stupid weenie");
        int userNumb = scan.nextInt();
        int saveuserNumb = userNumb;
        int odiousCount = 0;

        while(process){
            int binary = userNumb%2;

            if(binary == 1){
                odiousCount++;
            }
            int dividend = userNumb/2;

            if(dividend == 0){
                process = false;
            }
            userNumb = dividend;
        }
        System.out.println("--------------------------");
        if ((odiousCount % 2) == 1){
            System.out.println(saveuserNumb + " is an Odious Number");
        } else{
            System.out.println(saveuserNumb + " gis an evil Number!");
        }
        System.out.println("--------------------------");
    }
}