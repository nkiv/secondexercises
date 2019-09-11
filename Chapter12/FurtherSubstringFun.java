import java.util.Scanner;

public class FurtherSubstringFun{

    public static void main(String [] args){
        String inData, indexData, endData, sub, str;
        Scanner scan = new Scanner( System.in );


        
        System.out.println("Enter a String: ");
        inData = scan.nextLine();
        System.out.println("Enter Beginning index: ");
        indexData = scan.nextLine();
        System.out.println("Enter ending index: ");
        endData = scan.nextLine();
        
        String str = new String( inData );

        String sub = str.substring(indexData,endData);

        System.out.printLn("Substring: " + sub);
        

    }
}