package model;

import java.util.Date;

public class DonHang {
    private int id;
    private String thanhToan;
    private Date ngayDat;
    private Date ngayGiao;
    private String diaChiGiao;

    public DonHang() {
    }

    public DonHang(int id, String thanhToan, Date ngayDat, Date ngayGiao, String diaChiGiao) {
        this.id = id;
        this.thanhToan = thanhToan;
        this.ngayDat = ngayDat;
        this.ngayGiao = ngayGiao;
        this.diaChiGiao = diaChiGiao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(String thanhToan) {
        this.thanhToan = thanhToan;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public Date getNgayGiao() {
        return ngayGiao;
    }

    public void setNgayGiao(Date ngayGiao) {
        this.ngayGiao = ngayGiao;
    }

    public String getDiaChiGiao() {
        return diaChiGiao;
    }

    public void setDiaChiGiao(String diaChiGiao) {
        this.diaChiGiao = diaChiGiao;
    }
}
