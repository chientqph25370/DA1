/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.QLKhuyenMaiReponse;
import java.util.List;

/**
 *
 * @author FPT Shop
 */
public interface QlKhuyenMaiService {

    List<QLKhuyenMaiReponse> getAll();

    String insert(QLKhuyenMaiReponse km);

    String update(QLKhuyenMaiReponse km);

    String delete(QLKhuyenMaiReponse km);
}
