import java.util.Scanner;

public class LastChanceGas{

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        double tank, gage, mpg, getGas;

        System.out.println("Tank Capacity:");
        tank = scan.nextDouble();
        System.out.println("Gage Reading:");
        gage = scan.nextDouble();
        System.out.println("Miles Per gallon:");
        mpg = scan.nextDouble();

        getGas = tank*mpg*(gage*.01);

        if (getGas<200){
            System.out.println("Get Gas!");
        } else{
                System.out.println("Safe to Proceed!");
            }

    }
}