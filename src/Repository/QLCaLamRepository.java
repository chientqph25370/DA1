/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Utility.DBConnect;
import ViewModel.QLCaLamReponse;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
 

/**
 *
 * @author FPT Shop
 */
public class QLCaLamRepository {

    private String select_calam = "select manv,tennv,calam,ngaylam,giovaoca,giohetca,trangthai from calam";

    public List<QLCaLamReponse> getall() {
        List<QLCaLamReponse> list_calam = new ArrayList<>();
        try (Connection conn = DBConnect.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(select_calam);
            while (rs.next()) {
                QLCaLamReponse al = new QLCaLamReponse();
                al.setMANV(rs.getString(1));
                al.setTenNV(rs.getString(2));
                al.setCalam(rs.getString(3));
                 al.setNgaylam(rs.getString(4));
                al.setGiovaoca(rs.getString(5));
                al.setGiohetca(rs.getString(6));
                al.setTrangthai(rs.getInt(7));

//                list_calam.add(new QLCaLamReponse(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
//                       
//                        gioVcaDate=rs.getDate(5), rs.getDate(6),rs.getInt(7)));
                list_calam.add(al);

            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi ket noi ");

        }
        return list_calam;
    }

    public boolean add(QLCaLamReponse ql) {
        String insert_calam = "insert into calam(manv,tennv,calam,ngaylam,"
                + " giovaoca,giohetca,trangthai ) values(?,?,?,?,?,?,?)";
        try (Connection conn = DBConnect.getConnection()) {
            PreparedStatement rs = conn.prepareStatement(insert_calam);
            rs.setString(1, ql.getMANV());
            rs.setString(2, ql.getTenNV());
            rs.setString(3, ql.getCalam());
          rs.setString(4, ql.getNgaylam());
             rs.setString(5, ql.getGiovaoca());
             rs.setString(6, ql.getGiohetca());
//            rs.setDate(5, new java.sql.Date(ql.getGiovaoca().getTime()));
//            rs.setDate(6, (Date) ql.getGiohetca());
            rs.setInt(7, ql.getTrangthai());
            rs.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi ko the ket noi dc");
            return false;
        }

    }
     public boolean update(QLCaLamReponse  ql){
         String update_ban ="update calam set tennv=?,calam =?,ngaylam=?,giovaoca=?,giohetca=?, trangthai=? where manv=?";
               
         try(Connection conn = DBConnect.getConnection()){
             PreparedStatement rs = conn.prepareStatement(update_ban);
             rs.setString(1, ql.getTenNV());
             rs.setString(2, ql.getCalam());
             rs.setString(3, ql.getNgaylam());
             rs.setString(4, ql.getGiovaoca());
             rs.setString(5, ql.getGiohetca());
             
             rs.setInt(6, ql.getTrangthai());
             rs.setString(7, ql.getMANV());
             rs.executeUpdate();
             return true;
         }catch(Exception e){
             e.printStackTrace();
             System.out.println("loi ko the ket noi dc");
             return false;
         }
     }
      public boolean delete(QLCaLamReponse ql){
         String update_ban ="delete calam where manv=?";
               
         try(Connection conn = DBConnect.getConnection()){
             PreparedStatement rs = conn.prepareStatement(update_ban);
           
             rs.setString(1, ql.getMANV());
             rs.executeUpdate();
             return true;
         }catch(Exception e){
             e.printStackTrace();
             System.out.println("loi ko the ket noi dc");
             return false;
         }
     }
    
    
    

}
