import java.util.Scannner;

public class Wallpaper{

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int w, h, b, openings;

        System.out.println("What are the dimensions of the room? Please imput all integers in inches");

        System.out.println("The width is?");
        w = scan.nextInt();
        System.out.println("The height is?");
        h = scan.nextInt();
        System.out.println("The base is?");
        b = scan.nextInt();

        System.out.println("How many openings?");
        openings = scan.nextInt();

        int w2;
        int h2;
        int b2;
        int input;
        int area;
        int area2;
        while(openings > 0 ){
            System.out.println("What are the dimensions of the width?");
            input = scan.nextInt();
            w2 = w2 + input;
            System.out.println("What are the demsions of the height?");
            input = scan.nextInt();
            h2 = h2 + input;
            System.out.println("What are the dimensions of the base?");
            input = scan.nextInt();
            b2 = b2 + input;
            area = b2*h2*h2;
            openings--;
            area2 = area2 + area;
        }

        //a roll is 27 in by 162
        int roomDimensions = (b*w*h)-(area2);
    }
}