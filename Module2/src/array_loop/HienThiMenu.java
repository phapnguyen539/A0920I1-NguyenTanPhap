package array_loop;

import java.util.Scanner;

public class HienThiMenu {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1.In hình chữ nhật:");
        System.out.println("2.In hình tam giác vuông:");
        System.out.println("3.In hình tam giác cân:");
        System.out.println("0.Exit:");
        System.out.println("Nhập menu bạn muốn chọn.");
        int choice= input.nextInt();

        switch (choice) {
            case 1:
                for (int i=0;i<3;i++){
                    for (int j=0;j<10;j++){
                        System.out.print("*");
                    }
                    System.out.println("");

                }
        }
        }
    }

