package models;

public class SanPhamNhapKhau extends SanPham {
    private double giaNhap;
    private String tinhNhap;
    private double thueNhap;

    public SanPhamNhapKhau() {
    }

    public SanPhamNhapKhau(String id, int ma, String ten, double gia, int soluong, String nhasx, double giaNhap, String tinhNhap, double thueNhap) {
        super(id, ma, ten, gia, soluong, nhasx);
        this.giaNhap = giaNhap;
        this.tinhNhap = tinhNhap;
        this.thueNhap = thueNhap;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public String getTinhNhap() {
        return tinhNhap;
    }

    public void setTinhNhap(String tinhNhap) {
        this.tinhNhap = tinhNhap;
    }

    public double getThueNhap() {
        return thueNhap;
    }

    public void setThueNhap(double thueNhap) {
        this.thueNhap = thueNhap;
    }

    @Override
    public String toString() {
        return "SanPhamNhapKhau{" +
                "giaNhap=" + giaNhap +
                ", tinhNhap='" + tinhNhap + '\'' +
                ", thueNhap=" + thueNhap +
                '}';
    }

    @Override
    public String ShowInfor() {
        return null;
    }
    public String ghifileCSV(){
        return "ID San Pham: "+this.getId()+","+
                "Ma San Pham: "+this.getMa()+","+
                "Ten San Pham: "+this.getTen()+","+
                "Gia Ban: "+this.getGia()+","+
                "So Luong: "+this.getSoluong()+","+
                "Nha San Xuat: "+this.getNhasx()+","+
                "Gia Nhap Khau: "+this.getGiaNhap()+","+
                "Tinh Thanh Nhap: "+this.getTinhNhap()+","+
                "Thue Nhap Khau: "+this.getThueNhap()+",";
    }

}
