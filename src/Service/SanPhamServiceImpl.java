/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Interface.SanPhamService;
import Model.KhuyenMai;
import Model.NhaCungCap;
import Model.SanPham;
import Model.SanPhamNhap;
import java.util.Date;

/**
 *
 * @author THINH
 */
public class SanPhamServiceImpl implements SanPhamService{

    @Override
    public SanPham[] getAllSanPham() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateSanPham(SanPham sanpham) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public KhuyenMai[] getKhuyenMaiByDate(Date ngaybatdau, Date ngayketthuc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NhaCungCap[] getAllNhaCungCap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addNhaCungCap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateNhaCungCap(NhaCungCap nhacungcap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SanPhamNhap[] getSanPhamNhapBySanPham(SanPham sanpham) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SanPhamNhap[] getSanPhamNhapByDate(Date ngaybatdau, Date ngayketthuc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
