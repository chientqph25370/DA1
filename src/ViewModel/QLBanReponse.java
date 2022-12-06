/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author FPT Shop
 */
public class QLBanReponse {

    private String MaBan;
    private String ten ;
    private int  Trangthai;

  

    public QLBanReponse(String MaBan, String ten, int Trangthai) {
        this.MaBan = MaBan;
        this.ten = ten;
        this.Trangthai = Trangthai;
    }

    public QLBanReponse() {
    }

    public String getMaBan() {
        return MaBan;
    }

    public void setMaBan(String MaBan) {
        this.MaBan = MaBan;
    }

    public int getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(int  Trangthai) {
        this.Trangthai = Trangthai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
   public String trangthai(){
       if(Trangthai==1){
           return "hoat dong";
       }  else if (Trangthai ==0){
           return "ko hoat dong";
       }
       return null;
   }

    @Override
    public String toString() {
        return "QLBanReponse{" + "MaBan=" + MaBan + ", ten=" + ten + ", Trangthai=" + Trangthai + '}';
    }

    
    
    
}
