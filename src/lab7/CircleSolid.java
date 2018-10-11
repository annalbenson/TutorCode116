package lab7;

public abstract class CircleSolid {

    private double radius;

    public CircleSolid(){

    }

    public CircleSolid(double inputRadius){

    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double inputRadius) {
        radius = inputRadius;
    }

    public double getCircumference(){
        // circumference = 2 * pi * r
        return  2 * Math.PI * radius;
    }

    public double getArea(){

    }


}
