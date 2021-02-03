package bt_kethua_hinhtamgiac;

public class Triangle extends Shape {
    private String color="red";

    public Triangle(String color) {
        this.color = color;
    }

    public Triangle(double side1, double sile2, double side3, String color) {
        super(side1, sile2, side3);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Hình tam giác có: side1="+super.getSide1()+"side2="+
                super.getSide2()+"side3="+super.getSide3()+"Và có màu sắc là:"+ getColor()+
                super.toString();
    }
}
