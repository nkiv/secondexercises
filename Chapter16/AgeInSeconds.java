import java.util.Scanner;

public class AgeInSeconds{

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        double years, months, days , seconds, percentage, monthDay;

        System.out.println("Input years alive in whole numbers:");
        years = scan.nextDouble();

        System.out.println("Input remaining months alive:");
        months = scan.nextDouble();

        System.out.println("Input the remaining days alive:");
        days = scan.nextDouble();

        if(months == 1){
            monthDay = 30;
        }else if(months == 2){
            monthDay = 30 + 28;
        }else if(months == 3){
            monthDay = 30 + 28 + 31;
        }else if(months == 4){
            monthDay = 30 + 28 + 31 + 30;
        }else if(months == 5){
            monthDay = 30 + 28 + 31 + 30 + 31;
        }else if(months == 6){
            monthDay = 30 + 28 + 31 + 30 + 31 + 30;
        }else if(months == 7){
            monthDay = 30 + 28 + 31 + 30 + 31 + 30 + 31;
        }else if(months == 8){
            monthDay = 30 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
        }else if(months == 9){
            monthDay = 30 + 28 + 31 + 30 + 31 + 30 + 31 + 31 +30;
        }else if(months == 10){
            monthDay = 30 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
        }else if(months == 11){
            monthDay = 30 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
        }else if(months == 12){
            monthDay = 30 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;
        }

        seconds = (years * 365 * 24 * 60 * 60)+(months * 24 * 60 * 60)+(days * 60 * 60);

        percentage = (seconds/2500000) * .1;

        System.out.println("You have wasted " + percentage + " of your life");
    }
}