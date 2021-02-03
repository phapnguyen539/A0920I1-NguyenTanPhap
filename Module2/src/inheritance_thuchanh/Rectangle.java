package inheritance_thuchanh;

public class Rectangle extends Shape{
    private double withd=1.0;
    private double length=1.0;
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

    @Override
    public String toString() {
        return "Hình chữ nhật với withd:"+getWithd()+"and độ dài:"+getLength()+"Đó là lớp con của:"+
                super.toString();
    }
}

