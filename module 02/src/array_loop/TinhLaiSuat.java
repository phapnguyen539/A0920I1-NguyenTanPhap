package array_loop;

import java.util.Scanner;

public class TinhLaiSuat {
    public static void main(String[] args) {
     double money=1.0;
     int month=0;
     double interset=1.0;
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập số tiền muốn gởi:");
        money= input.nextDouble();
        System.out.println("Nhập số tháng muốn gởi;");
        month= input.nextInt();
        System.out.println("Nhập lãi suất gởi:");
        interset=input.nextDouble();
      double total=1.0;
      for (int i=0;i<month;i++){
          total+= money *(interset/100)/12* month;
      } System.out.println("Tổng lãi suất nhận được là:"+ total);

    }
}
