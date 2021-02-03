package mo_ta_cai_quat;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";


    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public Fan(){

    }


    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius)  {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if(on){
            return "speed:"+ this.speed+ "radius:"+ this.radius+"color:"+this.color+ "Fan is on .";
        }else{
            return "color:"+this.color+"radius:"+"Fan is off.";
        }
    }

    public static void main(String[] args) {
        Fan F1= new Fan(10,true,10,"yellow");
        Fan F2= new  Fan(5,false,5, "origin");
        System.out.println(F1.toString());
        System.out.println(F2.toString());
    }

    }

