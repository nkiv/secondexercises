public class Factoral{
    
    public static long factorial(int N){
        long fct = 1;

        if(N < 0 || N > 20){
            return -1;
        }
        for( int j =1; j<=N; j++){
            fct *= j;
            return fct;
        }
        return fct;
    }
    public static long factorialAlt(int N){
        long fct = 1;

        if( N < 0 || N > 20){
            return -1;
        }
        while(N > 0){
            fct *= N;
            N--;
        }
        return fct;
    }
    public static void main(String [] args){
        int N = 20;
        System.out.println( "factorial of " + N );
        System.out.println( "the second  method is : " + factorialAlt( N ));
        System.out.println( "the first method is : " + factorial( N ) ); 
        if(factorialAlt( N ) < 0 || factorial( N ) < 0) {
            System.out.println("Error");  
        }
    }
}