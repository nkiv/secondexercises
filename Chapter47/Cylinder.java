public class Cylinder{
    
    private double = radius;
    private double = height;

    public cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double volume(){
        return (Math.PI*(radius*radius))+height;
    }

    public double surfarea(){
        return (2*Math.PI*(radius*radius))+(2*Math.PI*(radius*height));
    }
}