import java.util.Scanner;

public class WindChillIndex{

    public static void main(String  [] args){

        double windSpeed, temp,outPut;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter wind Speed:");
        windSpeed = scan.nextDouble();

        System.out.println("Enter Temperature:");
        temp = scan.nextDouble();

        if(windSpeed < 3){
            outPut = temp;
        } else if(temp > 50){
                outPut = temp;
        } else{
            outPut = (35.74 + (0.6215 * temp) - (35.75 * (Math.pow(windSpeed,0.16)) + (0.4275 * temp * Math.pow(windSpeed,0.16))));
            }
        
        System.out.println("Wind Chill: " + outPut);
    }
}