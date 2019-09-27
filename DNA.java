import java.util.Scanner;

    public class DNA{
        public static void main(String [] args){

            Scanner scan = new Scanner(System.in);

            char A, C, G, T, q;

            String str, userInput;

            int index = 1;

            while(userInput != q){
                System.out.println("Enter DNA character: (A, C, G, T)");
                str = scan.nextLine();
                if(userInput != A^ C^ G^ T ^ q){
                    System.out.println("Invalid Input!");
                }
            }
            System.out.println("Thank you for imprinting your DNA values!");
            
            System.out.println(userInput);

            while(index <= userInput){
                System.out.println(userInput.substring(index));
                if(userInput.substring(index) == A){
                    str = str + T;
                } else if(userInput.substring(index) == C){
                    str = str + G;
                    } else if(userInput.substring(index) == T){
                    str = str + A;
                        } else if(userInput.substring(index) == G){
                    str = str + C;
                        }
                index = index + 1;
            }
            System.out.println(str);
            System.parse.char(A);
            if ((userInput/A)*.1 >= 40){
                System.out.println("You have high risk of cancer");
            }else if ((userInput/G)*.1 >= 40){
                System.out.println("You have high risk of cancer");
            }
            System.out.println("You chilling dawg!");
        }
    }