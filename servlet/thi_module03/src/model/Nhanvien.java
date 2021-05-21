package model;

import java.util.Date;

public class Nhanvien {
    private int idNhanVien;
    private String ten;
    private Date ngaySinh;
    private String diachi;

    public Nhanvien() {
    }

    public Nhanvien(int idNhanVien, String ten, Date ngaySinh, String diachi) {
        this.idNhanVien = idNhanVien;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diachi = diachi;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
