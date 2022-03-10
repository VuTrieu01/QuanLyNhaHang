package Model;

public class ThucDon {

    private String MaMon;
    private String TenMon;
    private String Loai;
    private String DonGia;

    public ThucDon() {
    }

    public ThucDon(String MaMon, String TenMon, String Loai, String DonGia) {
        this.MaMon = MaMon;
        this.TenMon = TenMon;
        this.Loai = Loai;
        this.DonGia = DonGia;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public String getDonGia() {
        return DonGia;
    }

    public void setDonGia(String DonGia) {
        this.DonGia = DonGia;
    }
}
