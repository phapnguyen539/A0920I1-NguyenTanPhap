package bai_tap_acessmodifier;

public class Cylinder extends Circle {
    private double height=1.0;
    public Cylinder(){
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getArea()*getHeight();
    }

    @Override
    public String toString() {
        return "Hình trụ có chiều cao là:"+ getHeight()+"Có thể tích là:"+ getVolume()+
                "Là lóp con của:"+
                super.toString();
    }
}
