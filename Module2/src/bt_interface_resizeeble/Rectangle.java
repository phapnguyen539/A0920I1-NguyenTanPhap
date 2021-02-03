package bt_interface_resizeeble;

public class Rectangle extends Shape implements Resizeable,InterColorable {
    private double withd= 1.0;
    private double length= 1.0;
    public Rectangle(){

    }

    public Rectangle(double withd, double length) {
        this.withd = withd;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double withd, double length) {
        super(color, filled);
        this.withd = withd;
        this.length = length;
    }

    public double getWithd() {
        return withd;
    }

    public void setWithd(double withd) {
        this.withd = withd;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return this.withd * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.withd + this.length);
    }

    @Override
    public String toString() {
        return "Hình chữ nhật có chiều rộng là:"+ withd+"và chiều dài là:"+length+"Thuộc lớp con của:"+
                super.toString();
    }

    @Override
    public void resize(double percent) {
//        setLength(getLength()+(getLength()*(percent/100)));
//        setWithd(getWithd()+(getWithd()*(percent/100)));
        length += length*percent/100;

    }

    @Override
    public void howToColor(String color) {
        System.out.println(color);
    }
}
