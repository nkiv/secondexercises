import java.util.Scanner;

public class SumOfDivisors{

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the N value: ");
        int n = scan.nextInt();

        int remainderSum = 0;
        int endSum = 0;

        for(int sum = 1; sum<n; sum++){
            remainderSum = n%sum;
            if(remainderSum == 0){
                endSum = endSum + sum;
            }
            System.out.println(endSum);
        }
        if(endSum == n){
            System.out.println("N is a Perfect number! ");
        }else{
            System.out.println("N is a non-perfect number! :(");
        }
    }
}