package OOP;

public class HinhChuNhat {
   private double width,height;
    public HinhChuNhat(){

    }
    public HinhChuNhat(double width,double height){
        this.width= width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

     public double getDientich(){
    return this.height*this.width;
     }
     public double getChuvi(){
        return  (this.height+this.width)*2;
     }
     public String display(){
        return "Có kích thước :("+" Width="+width+"Height="+height+")";
     }
}
