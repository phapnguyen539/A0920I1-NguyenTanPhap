package array_loop;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        // khai báo biến,nhập và kiểm tra kích thước mảng
        int size;
        int[] arr;
        Scanner scanner= new Scanner(System.in);
        do{
            System.out.print("Nhập vào giá trị:");
            size= scanner.nextInt();
            if(size> 20){
                System.out.println("Không nhập quá 20 giá trị.");
            }
        }while(size>20);
        //Nhập gá trị cho các phần tử của mảng.
        arr= new int[size];
        int i=0;
        while (i< arr.length){
            System.out.println("Nhập vào phần tử:"+ (i+1)+" : ");
            arr[i]= scanner.nextInt();
            i++;
        }
        //In ra danh sách đã nhập
        System.out.println("Danh sách tài sản:");
        for (int j=0;j<arr.length;j++){
            System.out.println(arr[j]+"\t");
        }
        // Duyệt các phần tử trong mảng để tìm ra giá trị lớn nhất.
        int max= arr[0];
        int index=1;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
                index=j+1;
            }
        }
        System.out.println("Giá trị lớn nhất trong danh sách là:" +"\t"+max+ "Tại vị trí:"+ index);


    }
}
