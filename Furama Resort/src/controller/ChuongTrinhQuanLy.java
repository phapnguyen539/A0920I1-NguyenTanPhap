package controller;

import commons.ReadFile;
import commons.Regex;
import models.SanPhamNhapKhau;

import java.nio.file.Files;
import java.util.Scanner;

public class ChuongTrinhQuanLy {
private static Scanner scanner=new Scanner(System.in);

public static void chonChucNang(){
    System.out.println("1.Thêm mới\n"+
            "2.Xóa\n"+
            "3.Danh sách sản phẩm\n"+
            "4.Tìm kiếm\n"+
            "5.Thoát\n");
    int choise= Integer.parseInt(scanner.nextLine());
    switch (choise) {
        case 1:
            themMoi();
            chonChucNang();
        case 2:
            xoa();
            chonChucNang();
        case 3:
            danhSachSanPham();
            chonChucNang();
        case 4:
            timKiem();
            chonChucNang();
        case 5:
            thoat();
            chonChucNang();
    }
    }

public static void themMoi(){
    String id;
    String ma;
    String ten;
    String gia;
    String soLuong;
    String nhaSx;
    String giaNhap;
    String tinhNhap;
    String thueNhap;
       System.out.println("Thêm sản phẩm nhập khẩu");
     do {
         System.out.println("Nhập id");
         id = scanner.nextLine();
     }while (!Regex.validateall(id));
    System.out.println("Nhập mã");
    ma=scanner.nextLine();
    System.out.println("Nhập tên sản phẩm");
    ten=scanner.nextLine();
    System.out.println("Nhập giá");
    gia=scanner.nextLine();
    System.out.println("Nhập số lượng");
    soLuong=scanner.nextLine();
    System.out.println("Nhập nhà SX");
    nhaSx=scanner.nextLine();
    System.out.println("Nhập giá nhập khẩu");
    giaNhap=scanner.nextLine();
    System.out.println("Nhập tỉnh thành nhập");
    tinhNhap=scanner.nextLine();
    System.out.println("Nhập thuế nhập khẩu");
    thueNhap= scanner.nextLine();
    SanPhamNhapKhau sanPhamNhapKhau= new SanPhamNhapKhau(id,Integer.parseInt(ma),ten,Double.parseDouble(gia),Integer.parseInt(soLuong),nhaSx,
            Double.parseDouble(giaNhap),tinhNhap,Double.parseDouble(thueNhap));
    String data= sanPhamNhapKhau.ghifileCSV();
    ReadFile.writerfile("C:\a0920i1-Nguyen_Tan_Phap\Furama Resort\src\data\FileDoc.csv",data,true);
}
public static void xoa(){

}
public static void danhSachSanPham(){

}
public static void timKiem(){

}
public static void thoat(){

}

    public static void main(String[] args) {
        chonChucNang();
    }
}
