/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Repository.QLKhuyenMaiRepository;
import Service.QlKhuyenMaiService;
import ViewModel.QLKhuyenMaiReponse;
import java.util.List;

/**
 *
 * @author FPT Shop
 */
public class QLKhuyenMaiImpl implements QlKhuyenMaiService {

    QLKhuyenMaiRepository repository = new QLKhuyenMaiRepository();

    @Override
    public List<QLKhuyenMaiReponse> getAll() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.getAll();
    }

    @Override
    public String insert(QLKhuyenMaiReponse km) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.insert(km);
    }

    @Override
    public String update(QLKhuyenMaiReponse km) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return repository.update(km);
    }

    @Override
    public String delete(QLKhuyenMaiReponse km) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.delete(km);
    }

}
