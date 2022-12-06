/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;
import Utility.DBConnect;
import ViewModel.QLBanReponse;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
 
 
/**
 *
 * @author FPT Shop
 */
public class QLBANRepository {
    private  String select_ban ="select *from ban";
    
    public List<QLBanReponse> getall(){
        List<QLBanReponse> listban = new ArrayList<>();
        
        try(Connection conn = DBConnect.getConnection()){
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(select_ban);
            while(rs.next()){
             listban.add(new QLBanReponse(rs.getString(1), rs.getString(2), rs.getInt(3)));
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("loi ket noi ko vao dc");
            
        }
        return listban;
        
    }
     public boolean update(QLBanReponse ql){
         String update_ban ="update ban set trangthai=? where maban=?";
         try(Connection conn = DBConnect.getConnection()){
             PreparedStatement rs = conn.prepareStatement(update_ban);
             rs.setInt(1, ql.getTrangthai());
             rs.setString(2, ql.getMaBan());
             rs.executeUpdate();
             return true;
         }catch(Exception e){
             e.printStackTrace();
             System.out.println("loi ko the ket noi dc");
             return false;
         }
         
         
         
     }
    

    
    
    
    
}
