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
    //kiểm tra tên tk, mật khẩu trùng với nhân viên nào, thì return nhanvien đó.
    public NhanVien loginAccount(String username, String password) {
        NhanVien nhanvien = new NhanVien("001", "Nguyen Van A", "dia chi", "sdt", "email@gmail.com", "stk", "matkhau", "tentk", true);
        if(checkUsernameAndPassword(nhanvien, username, password))
            return nhanvien;
        else
            return null;
    }
    private boolean checkUsernameAndPassword(NhanVien nhanvien, String username, String password){
        return nhanvien.getTenTaiKhoan().equals(username) & nhanvien.getMatkhau().equals(password);
    }
    //tạo tên tk, mật khẩu, các thông tin khác để trống.
    //thành công return true, ko thành công return false;
    public boolean createNewAccount(NhanVien nhanvien) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //cập nhật thông tin nhân viên = mã nhân viên.
    //thành công return true, ko thành công return false;
    public boolean updateNhanVien(NhanVien nhanvien) {
        return true;
    }
    //thêm mới 1 nhân viên, với đầy đủ thông tin, tự cập nhật mã nhân viên
    //thành công return true, ko thành công return false;
    public boolean addNhanVien(NhanVien nhanvien) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //lấy tất cả nhân viên từ csdl
    public NhanVien[] getAllNhanVien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //lấy tất cả vai trò từ csdl
    public VaiTro[] getAllVaiTro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //lấy tất cả quyền từ csdl
    public Quyen[] getAllQuyen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // cập nhật vai trò = mã vai trò
    //thành công return true, ko thành công return false;
    public boolean updateVaiTro(VaiTro vaitro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // thêm mới một vai trò, tự cập nhật mã vai trò.
    //thành công return true, ko thành công return false;
    public boolean addVaiTro(VaiTro vaitro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
