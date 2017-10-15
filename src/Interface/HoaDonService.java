/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Model.HoaDon;
import Model.NhanVien;
import java.util.Date;

/**
 *
 * @author THINH
 */
public interface HoaDonService {
    public boolean saveHoaDon(HoaDon hoadon);
    public HoaDon[] getHoaDonByDate(Date ngaybatdau, Date ngayketthuc);
    public HoaDon[] getHoaDonByNhanVien(NhanVien nhanvien);
    
}
