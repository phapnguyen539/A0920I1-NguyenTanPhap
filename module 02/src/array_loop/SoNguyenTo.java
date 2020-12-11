package array_loop;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 số nguyên:");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + "\t" + "Không phải là số nguyên tố.");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + "\t" + "Là số nguyên  tố.");
            } else {
                System.out.println(number + "\t" + "Không phải là số nguyên tố.");
            }
        }
    }
}
