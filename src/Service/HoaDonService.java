/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.HoaDon;
import Model.NhanVien;
import java.util.Date;

/**
 *
 * @author THINH
 */
public class HoaDonService {

    private static HoaDonService Instance = null;

    private HoaDonService() {
    }

    public static HoaDonService getInstance() {
        if (Instance == null) {
            Instance = new HoaDonService();
        }
        return Instance;
    }
    //lưu lại hóa đơn vào csdl, hóa đơn gửi từ view qua.
    //thành công return true, ko thành công return false;
    public boolean saveHoaDon(HoaDon hoadon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //lấy hóa đơn bằng cách so sánh ngaybatdau và ngayketthuc
    public HoaDon[] getHoaDonByDate(Date ngaybatdau, Date ngayketthuc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //lấy hoa đơn bằng cách so sánh mã nhân viên tạo ra hóa đơn đó.
    public HoaDon[] getHoaDonByNhanVien(NhanVien nhanvien) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
