/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Repository.QLNVRepository;
import Service.QLNhanVienService;
import ViewModel.QLNhanVien;
import java.util.List;

/**
 *
 * @author admin
 */
public class QLNhanVienImpl implements QLNhanVienService{

    QLNVRepository qLNVR = new QLNVRepository();
    
    @Override
    public List<QLNhanVien> getAll() {
        return qLNVR.getAll();
    }

    @Override
    public String add(QLNhanVien q) {
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
    public String update(QLNhanVien q, String ma) {
        boolean update = qLNVR.update(q, ma);
        if(update){
            return "Update thành công";
        }else{
            return "Update thất bại";
        }
    }
}
