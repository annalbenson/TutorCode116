package lab7;

public class Sphere extends CircleSolid {

    public Sphere(){
        setRadius(0);
    }

    public Sphere(double inputRadius){
        setRadius(inputRadius);
    }

    public double getVolume(){
        // volume =  4/3 * pi * r^3
        return (4.0/3.0) * Math.PI * Math.pow(getRadius(),3);
    }

    public String toString(){
        return super.toString() + "Sphere: Volume=" + getVolume();
    }



}
