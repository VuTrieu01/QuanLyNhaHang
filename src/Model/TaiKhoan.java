package Model;

public class TaiKhoan {

    String TenTk, MatKhau, VaiTro;

    public TaiKhoan() {
    }

    public TaiKhoan(String TenTk, String MatKhau, String VaiTro) {
        this.TenTk = TenTk;
        this.MatKhau = MatKhau;
        this.VaiTro = VaiTro;
    }

    public String getTenTk() {
        return TenTk;
    }

    public void setTenTk(String TenTk) {
        this.TenTk = TenTk;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }
}
