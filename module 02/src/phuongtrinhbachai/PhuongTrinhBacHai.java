package phuongtrinhbachai;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    private double a,b,c;

    public PhuongTrinhBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double  getDiscriminant(){
        return Math.pow(this.b,2)-4*this.a*this.c;
    }
    public double getRoot1(){
        return (-this.b+ getDiscriminant())/ 2*this.a;
    }
    public double getRoot2(){
        return (-this.b- getDiscriminant())/ 2*this.a;
    }
    public double getRoot3(){
        return (-this.b)/ 2*this.a;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập vào a:");
        double a= sc.nextDouble();
        System.out.println("Nhập vào b:");
        double b= sc.nextDouble();
        System.out.println("Nhập vào c:");
        double c= sc.nextDouble();
        PhuongTrinhBacHai bachai= new PhuongTrinhBacHai(a,b,c);
        if (bachai.getDiscriminant()>0){
            System.out.println("Nghiệm 1 là:"+bachai.getRoot1()+ "Nghiêm 2 là:"+bachai.getRoot2());
        }else if(bachai.getDiscriminant()==0) {
            System.out.println("PT có nghiệm là:" + bachai.getRoot3());
        }else{
            System.out.println("Phương trình vô nghiệm.");
        }

    }
}


