/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Model.NhanVien;
import Model.Quyen;
import Model.VaiTro;

/**
 *
 * @author THINH
 */
public interface NhanVienService {
    NhanVien loginAccount(String username, String password);
    boolean createNewAccount(NhanVien nhanvien);
    boolean updateNhanVien(NhanVien nhanvien);
    boolean addNhanVien(NhanVien nhanvien);
    NhanVien[] getAllNhanVien();
    VaiTro[] getAllVaiTro();
    Quyen[] getAllQuyen();
    boolean updateVaiTro(VaiTro vaitro);
    boolean addVaiTro(VaiTro vaitro);
}
