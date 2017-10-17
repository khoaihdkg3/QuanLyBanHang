package Service;

import Model.KhuyenMai;
import Model.NhaCungCap;
import Model.SanPham;
import Model.SanPhamNhap;
import java.util.Date;
public class SanPhamService {

    private static SanPhamService Instance = null;

    private SanPhamService() {
    }

    public static SanPhamService getInstance() {
        if (Instance == null) {
            Instance = new SanPhamService();
        }
        return Instance;
    }
    
    public SanPham[] getAllSanPham() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean updateSanPham(SanPham sanpham) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public KhuyenMai[] getKhuyenMaiByDate(Date ngaybatdau, Date ngayketthuc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public NhaCungCap[] getAllNhaCungCap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addNhaCungCap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean updateNhaCungCap(NhaCungCap nhacungcap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public SanPhamNhap[] getSanPhamNhapBySanPham(SanPham sanpham) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public SanPhamNhap[] getSanPhamNhapByDate(Date ngaybatdau, Date ngayketthuc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
