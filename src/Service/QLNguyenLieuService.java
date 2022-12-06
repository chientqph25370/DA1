/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.QLNguyenLieu;
import java.util.List;

/**
 *
 * @author FPT Shop
 */
public interface QLNguyenLieuService {
    List<QLNguyenLieu> getAll();
    
    String add(QLNguyenLieu q);
    
    String delete(String ma);
    
    String update(QLNguyenLieu q, String ma);
}
