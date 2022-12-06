/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.QLNhanVien;
import java.util.List;

/**
 *
 * @author admin
 */
public interface QLNhanVienService {
    List<QLNhanVien> getAll();
    
    String add(QLNhanVien q);
    
    String delete(String ma);
    
    String update(QLNhanVien q, String ma);
}
