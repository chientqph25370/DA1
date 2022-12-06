/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Repository.QLNLRepository;
import Service.QLNguyenLieuService;
import ViewModel.QLNguyenLieu;
import java.util.List;

/**
 *
 * @author FPT Shop
 */
public class QLNguyenLieuImpl implements QLNguyenLieuService{
    QLNLRepository qLNVR = new QLNLRepository();
    
    @Override
    public List<QLNguyenLieu> getAll() {
        return qLNVR.getAll();
    }

    @Override
    public String add(QLNguyenLieu q) {
        boolean add = qLNVR.add(q);
        if(add){
            return "Add thành công";
        }else{
            return "Add thất bại";
        }
    }

    @Override
    public String delete(String ma) {
        boolean delete = qLNVR.delete(ma);
        if(delete){
            return "Delete thành công";
        }else{
            return "Delete thất bại";
        }
    }

    @Override
    public String update(QLNguyenLieu q, String ma) {
        boolean update = qLNVR.update(q, ma);
        if(update){
            return "Update thành công";
        }else{
            return "Update thất bại";
        }
    }
}
