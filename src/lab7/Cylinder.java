package lab7;

public class Cylinder extends CircleSolid{

    private double height;

    public Cylinder(){
        setRadius(0);
        setHeight(0);
    }

    public Cylinder(double inputRadius, double inputHeight){
        setRadius(inputRadius);
        setHeight(inputHeight);
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double inputHeight){
        height = inputHeight;
    }

    public double getVolume(){
        // volume = pi * r^2 * h
        return Math.PI * Math.pow(getRadius(),2) * height;
    }

    public String toString(){
        return super.toString() + "Cylinder: Height=" + height + " Volume=" + getVolume();
    }


}
