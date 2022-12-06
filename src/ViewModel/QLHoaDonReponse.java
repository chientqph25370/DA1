/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author FPT Shop
 */
public class QLHoaDonReponse {
 private String MaHD ;
  private String NgayTao  ;
 private String Trangthai  ;
 private String ThoiGian  ;
  private float  gia ;
  private String MaKM ;
    private String Manv ;
  private float ThanhTien ;

    public QLHoaDonReponse() {
    }

    public QLHoaDonReponse(String MaHD, String NgayTao, String Trangthai, String ThoiGian, float gia, String MaKM, String Manv, float ThanhTien) {
        this.MaHD = MaHD;
        this.NgayTao = NgayTao;
        this.Trangthai = Trangthai;
        this.ThoiGian = ThoiGian;
        this.gia = gia;
        this.MaKM = MaKM;
        this.Manv = Manv;
        this.ThanhTien = ThanhTien;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(String NgayTao) {
        this.NgayTao = NgayTao;
    }

    public String getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(String Trangthai) {
        this.Trangthai = Trangthai;
    }

    public String getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(String ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getMaKM() {
        return MaKM;
    }

    public void setMaKM(String MaKM) {
        this.MaKM = MaKM;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
   
}
