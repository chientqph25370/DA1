/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *;
// * 02:12:55
// * chuanghoatg 
// * string s 
// * chuanhoatg(s)
// * string time 
// * tach 1 chuoi thanh mang theo ky tu torng ngoac
// * string [] res  = time.splice(":") res[0] = '2' res[1]=12 res[2]= 55
// * if (res[0] - "0" < 10)
// *  res[0] = '0' + res[0];
// * else if 
 * @author FPT Shop
 */
public class QLCaLamReponse {

    private String MANV;
    private String tenNV;
    private String calam;
    private String  ngaylam;
          
    public String giovaoca;
    public  String giohetca;
    private int trangthai ; 
    public QLCaLamReponse() {
    }

    public QLCaLamReponse(String MANV, String tenNV, String calam, String ngaylam, String giovaoca, String giohetca, int trangthai) {
        this.MANV = MANV;
        this.tenNV = tenNV;
        this.calam = calam;
        this.ngaylam = ngaylam;
        this.giovaoca = giovaoca;
        this.giohetca = giohetca;
        this.trangthai = trangthai;
    }

     

     

    

    

     

    

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getCalam() {
        return calam;
    }

    public void setCalam(String calam) {
        this.calam = calam;
    }

    public String getNgaylam() {
        return ngaylam;
    }

    public void setNgaylam(String ngaylam) {
        this.ngaylam = ngaylam;
    }

     

     

    public String getGiovaoca() {
        return giovaoca;
    }

    public void setGiovaoca(String giovaoca) {
        this.giovaoca = giovaoca;
    }

    public String getGiohetca() {
        return giohetca;
    }

    public void setGiohetca(String giohetca) {
        this.giohetca = giohetca;
    }
 public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
//     public String trangthai (){
//         if(trangthai ==1){
//             return "da lam";
//         }else if(trangthai==0){
//            return "chua lam";
//         }else {
//             
//         }
//         
//     }
    @Override
    public String toString() {
        return "QLCaLamReponse{" + "MANV=" + MANV + ", tenNV=" + tenNV + ", calam=" + calam + ", ngaylam=" + ngaylam + ", giovaoca=" + giovaoca + ", giohetca=" + giohetca + ", trangthai=" + trangthai + '}';
    }

    

     

}
