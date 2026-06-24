package week02;

public class Circle {
    public double radius;
    public int centreX;
    public int centreY;

    public double circumference(){
        double result = Math.PI * radius * 2;
        return result;
    }

    public double area(){
        double area = Math.PI * radius * radius;
        return area;
    }

    public double resize(double factor){
        radius *= factor;
        return radius;
    }

}