class ArraySum{

  public static void main ( String[] args ){
    int[] val = {0, 1, 2, 3}; 
    int sum = 0;
    int count = 3;
    int x = 3;
    while(count > 1){
        sum = val[x] + val[x+1];
        count--;
        x--;
        System.out.println(sum);
    }
    System.out.println( "Sum of all numbers = " + sum );
 
   }
}