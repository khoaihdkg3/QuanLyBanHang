/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.NhanVien;
import Model.Quyen;
import Model.VaiTro;

/**
 *
 * @author THINH
 */
public class NhanVienService {

    private static NhanVienService Instance = null;

    private NhanVienService() {
    }

    public static NhanVienService getInstance() {
        if (Instance == null) {
            Instance = new NhanVienService();
        }
        return Instance;
    }

    public NhanVien loginAccount(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean createNewAccount(NhanVien nhanvien) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean updateNhanVien(NhanVien nhanvien) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addNhanVien(NhanVien nhanvien) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public NhanVien[] getAllNhanVien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public VaiTro[] getAllVaiTro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Quyen[] getAllQuyen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean updateVaiTro(VaiTro vaitro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addVaiTro(VaiTro vaitro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
