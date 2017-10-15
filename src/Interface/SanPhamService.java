/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Model.KhuyenMai;
import Model.NhaCungCap;
import Model.SanPham;
import Model.SanPhamNhap;
import java.util.Date;

/**
 *
 * @author THINH
 */
public interface SanPhamService {
    public SanPham[] getAllSanPham();
    public boolean updateSanPham(SanPham sanpham);
    public KhuyenMai[] getKhuyenMaiByDate(Date ngaybatdau, Date ngayketthuc);
    public NhaCungCap[] getAllNhaCungCap();
    public boolean addNhaCungCap();
    public boolean updateNhaCungCap(NhaCungCap nhacungcap);
    public SanPhamNhap[] getSanPhamNhapBySanPham(SanPham sanpham);
    public SanPhamNhap[] getSanPhamNhapByDate(Date ngaybatdau, Date ngayketthuc);
    
}
