package OOP;

import java.util.Scanner;

public class Hienthi {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập vào width:");
        double width= scanner.nextDouble();
        System.out.println("Nhập vào height:");
        double height=scanner.nextDouble();
        HinhChuNhat tinhtoan= new HinhChuNhat(width,height);
        System.out.println("Hình chữ nhật của bạn: \n"+ tinhtoan.display());
        System.out.println("Chu vi hình chữ nhật là:"+ tinhtoan.getChuvi());
        System.out.println("Diện tích hình chữ nhật là:"+tinhtoan.getDientich());
    }
}

