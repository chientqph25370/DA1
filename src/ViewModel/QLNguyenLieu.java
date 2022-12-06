/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author admin
 */
public class QLNguyenLieu {
    private String maNL;
    private String tenNL;
    private int soLuong;
    private float giaTien;
    private String moTa;

    public QLNguyenLieu() {
    }

    public QLNguyenLieu(String maNL, String tenNL, int soLuong, float giaTien, String moTa) {
        this.maNL = maNL;
        this.tenNL = tenNL;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
        this.moTa = moTa;
    }

    public String getMaNL() {
        return maNL;
    }

    public void setMaNL(String maNL) {
        this.maNL = maNL;
    }

    public String getTenNL() {
        return tenNL;
    }

    public void setTenNL(String tenNL) {
        this.tenNL = tenNL;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    public Object[] toDataRow(){
        return new Object[]{maNL, tenNL, soLuong, giaTien, moTa};
    }
}
