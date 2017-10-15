/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Interface.HoaDonService;
import Model.HoaDon;
import Model.NhanVien;
import java.util.Date;

/**
 *
 * @author THINH
 */
public class HoaDonServiceImpl implements HoaDonService{

    @Override
    public boolean saveHoaDon(HoaDon hoadon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HoaDon[] getHoaDonByDate(Date ngaybatdau, Date ngayketthuc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HoaDon[] getHoaDonByNhanVien(NhanVien nhanvien) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
