package bt_interface_resizeeble;

public class Circle extends Shape implements Resizeable {
    private double radius=1.0;
    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius* Math.PI;
    }
    public double getPerimeter(){
        return 2* radius* Math.PI;
    }

    @Override
    public String toString() {
        return "Hình tròn có bán kính là:"+ getRadius()+"Là lớp con của:"+
                super.toString();
    }

    @Override
    public void resize(double percent) {
       setRadius(getRadius()+(getRadius()* (percent/100)));
    }
}
