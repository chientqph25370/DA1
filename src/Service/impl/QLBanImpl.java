/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Repository.QLBANRepository;
import Service.QLBanService;
import ViewModel.QLBanReponse;
import java.util.List;

/**
 *
 * @author FPT Shop
 */
public class QLBanImpl implements QLBanService {

    QLBANRepository getall = new QLBANRepository();

    @Override
    public List<QLBanReponse> getall() {
        return getall.getall();
    }

    @Override
    public String add(QLBanReponse br) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String update(QLBanReponse br) {
        if (getall.update(br)) {
            return "sua thanh cong";
        }
        return "sua ko thanh cong ";
    }

    @Override
    public String delete(QLBanReponse br) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
