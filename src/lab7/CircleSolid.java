package lab7;

public abstract class CircleSolid {

    private double radius;

    public CircleSolid(){
        setRadius(0);
    }

    public CircleSolid(double inputRadius){
        setRadius(inputRadius);
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
        // area = pi * r * r
        return Math.PI * Math.pow(radius,2);
    }

    public String toString(){
        return "CircleSolid: Radius=" + radius +"\n";
    }

    public abstract double getVolume();
}
