package bt_interface_resizeeble;

public class Square extends Rectangle implements Resizeable, InterColorable {
    public  Square(){

    }
    public Square(double side){
        super(side,side);
    }

    public Square( String color, boolean filled, double side ) {
        super( color, filled , side , side);
    }
    public double getSide(){
        return getWithd();
    }
    public void setSide(double side){
        super.setWithd(side);
        super.setLength(side);
    }

    @Override
    public void setWithd(double withd) {
        setSide(withd);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Hình vuông có cạnh là:"+ getSide()+"Thuộc lớp con của:"+
                super.toString();
    }

    @Override
    public void resize(double percent) {
       super.resize(percent);
    }

    @Override
    public void howToColor(String color) {
        super.howToColor(color);
    }
}
