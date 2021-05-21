package model;

import java.util.Date;

public class KhachHang {
    private int id;
    private String ten;
    private Date ngaySinh;
    private int dienThoai;
    private String diaChi;
    private String email;

    public KhachHang() {
    }

    public KhachHang(int id, String ten, Date ngaySinh, int dienThoai, String diaChi, String email) {
        this.id = id;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.dienThoai = dienThoai;
        this.diaChi = diaChi;
        this.email = email;
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(int dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
