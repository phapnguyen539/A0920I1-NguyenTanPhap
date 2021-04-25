package models;

public abstract class SanPham {
    private String id;
    private int ma;
    private String ten;
    private double gia;
    private int soluong;
    private String nhasx;

    public SanPham() {
    }

    public SanPham(String id, int ma, String ten, double gia, int soluong, String nhasx) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.soluong = soluong;
        this.nhasx = nhasx;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
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

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getNhasx() {
        return nhasx;
    }

    public void setNhasx(String nhasx) {
        this.nhasx = nhasx;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id='" + id + '\'' +
                ", ma=" + ma +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                ", soluong=" + soluong +
                ", nhasx='" + nhasx + '\'' +
                '}';
    }
    public abstract String ShowInfor();
}
