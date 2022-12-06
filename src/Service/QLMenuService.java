/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.QLMenuReponse;
import java.util.List;

/**
 *
 * @author FPT Shop
 */
public interface QLMenuService {
   List<QLMenuReponse> getall();
   String update(QLMenuReponse qlmenu, String maSP);
    
    
}
