package inheritance_thuchanh;

public class Square extends Rectangle {
   public Square(){

   }public Square(double size){
       super(size,size);
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled, size ,size);
    }
    public double getSize(){
       return (getWithd());
    }
    public void setSize(double size){
       setWithd(size);
       setLength(size);
    }

    @Override
    public void setWithd(double withd) {
        super.setWithd(withd);
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public String toString() {
        return "Hình vuông có cạnh là:"+ getSize()+"Là 1 lớp con của:" + super.toString();
    }
}
