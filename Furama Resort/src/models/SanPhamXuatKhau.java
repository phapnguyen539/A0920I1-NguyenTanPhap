package models;

public class SanPhamXuatKhau extends SanPham{
    private double giaXuat;
    private String quocGiaNhap;

    public SanPhamXuatKhau() {
    }

    public SanPhamXuatKhau(String id, int ma, String ten, double gia, int soluong, String nhasx, double giaXuat, String quocGiaNhap) {
        super(id, ma, ten, gia, soluong, nhasx);
        this.giaXuat = giaXuat;
        this.quocGiaNhap = quocGiaNhap;
    }

    public double getGiaXuat() {
        return giaXuat;
    }

    public void setGiaXuat(double giaXuat) {
        this.giaXuat = giaXuat;
    }

    public String getQuocGiaNhap() {
        return quocGiaNhap;
    }

    public void setQuocGiaNhap(String quocGiaNhap) {
        this.quocGiaNhap = quocGiaNhap;
    }

    @Override
    public String toString() {
        return "SanPhamXuatKhau{" +
                "giaXuat=" + giaXuat +
                ", quocGiaNhap='" + quocGiaNhap + '\'' +
                '}';
    }

    @Override
    public String ShowInfor() {
        return null;
    }

}
