package model;

public class Sanpham {
   private int id;
   private String ten;
   private double gia;
   private int mucgiam;
   private String tonkho;

    public Sanpham() {
    }

    public Sanpham(int id, String ten, double gia, int mucgiam, String tonkho) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.mucgiam = mucgiam;
        this.tonkho = tonkho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getMucgiam() {
        return mucgiam;
    }

    public void setMucgiam(int mucgiam) {
        this.mucgiam = mucgiam;
    }

    public String getTonkho() {
        return tonkho;
    }

    public void setTonkho(String tonkho) {
        this.tonkho = tonkho;
    }
}
