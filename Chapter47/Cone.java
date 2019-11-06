public class Cone{

    private double radius;
    private double height;

    public Cone( double radius, double height ){
    this.radius = radius;
    this.height = height;
    }

    public double area(){

        return Math.PI*radius*(radius + Math.sqrt(height*height + radius*radius) );
    }

    public double volume(){
        return Math.PI*radius*radius*height/3.0;  

    }

    public double slant(){
        return Math.sqrt((radius*radius) +(height*height));
    }

    public double angle(){
        return (radius/height);
    }
}
