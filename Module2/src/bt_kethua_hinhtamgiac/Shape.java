package bt_kethua_hinhtamgiac;

public class Shape {
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;
    public Shape(){
    }

    public Shape(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getNuaChuVi(){
        return (side1+side2+side3)/2;
    }
    public double getArea(){
        return Math.sqrt(getNuaChuVi()*(getNuaChuVi()-side1)*getNuaChuVi()-side2*(getNuaChuVi()-side3));
    }
    public double getPrimeter(){
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Hình có dạng: side1= " +getSide1() + "side2=" + getSide2()+ "side3=" +getSide3();

    }
}
