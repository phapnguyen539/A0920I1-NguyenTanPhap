package baitap_hinhtron_kethua;

public class Circle {
    private boolean filled= true;
    private double radius=1.0;
    private String color="red";
    public Circle(){

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(boolean filled, double radius, String color) {
        this.filled = filled;
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return radius*radius* Math.PI;
    }
    public double getPerimeter(){
        return 2* radius* Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "filled=" + filled +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
