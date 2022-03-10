package Model;

public class DatBan {

    private String MaBan;
    private int TrangThai;

    public DatBan() {
    }

    public DatBan(String MaBan, int TrangThai) {
        this.MaBan = MaBan;
        this.TrangThai = TrangThai;
    }

    public String getMaBan() {
        return MaBan;
    }

    public void setMaBan(String MaBan) {
        this.MaBan = MaBan;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }
}
