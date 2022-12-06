/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author FPT Shop
 */
public class QLMenuReponse {

    String masp;
    String Tensp;
    double Giasp;
    String trangthai;
    int soluong;

    public QLMenuReponse() {
    }

    public QLMenuReponse(String masp, String Tensp, double Giasp, String trangthai, int soluong) {
        this.masp = masp;
        this.Tensp = Tensp;
        this.Giasp = Giasp;
        this.trangthai = trangthai;
        this.soluong = soluong;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public double getGiasp() {
        return Giasp;
    }

    public void setGiasp(double Giasp) {
        this.Giasp = Giasp;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

}
