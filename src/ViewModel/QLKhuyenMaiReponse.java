/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author FPT Shop
 */
public class QLKhuyenMaiReponse {

    private String MaKm;
    private String TenKm;
    private String NgayBatDau;
    private String NgayKetThuc;
    private String Trangthai;
    private String NoiDung;

    public QLKhuyenMaiReponse() {
    }

    public QLKhuyenMaiReponse(String MaKm, String TenKm, String NgayBatDau, String NgayKetThuc, String Trangthai, String NoiDung) {
        this.MaKm = MaKm;
        this.TenKm = TenKm;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.Trangthai = Trangthai;
        this.NoiDung = NoiDung;
    }

    public String getMaKm() {
        return MaKm;
    }

    public void setMaKm(String MaKm) {
        this.MaKm = MaKm;
    }

    public String getTenKm() {
        return TenKm;
    }

    public void setTenKm(String TenKm) {
        this.TenKm = TenKm;
    }

    public String getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(String NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public String getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(String NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public String getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(String Trangthai) {
        this.Trangthai = Trangthai;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String NoiDung) {
        this.NoiDung = NoiDung;
    }

    @Override
    public String toString() {
        return "QLKhuyenMaiReponse{" + "MaKm=" + MaKm + ", TenKm=" + TenKm + ", NgayBatDau=" + NgayBatDau + ", NgayKetThuc=" + NgayKetThuc + ", Trangthai=" + Trangthai + ", NoiDung=" + NoiDung + '}';
    }

}
