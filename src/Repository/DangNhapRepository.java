/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import ViewModel.DangNhapResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import Utility.DBConnect;

/**
 *
 * @author hp
 */
public class DangNhapRepository {

    public DangNhapResponse login(String user, String pass)  {
        String query = "SELECT *\n"
                + "  FROM [dbo].[TAIKHOAN] WHERE [Ten] like ? AND [Pass] like ?";
        try ( Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(query)){
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return new DangNhapResponse(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
}
