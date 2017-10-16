package View;

import Service.HoaDonService;
import Service.NhanVienService;
import Service.SanPhamService;
import java.awt.HeadlessException;
public class Viewer extends javax.swing.JFrame {

    protected HoaDonService HoaDonService;
    protected NhanVienService NhanVienService;
    protected SanPhamService SanPhamService;

    public Viewer() throws HeadlessException {
        initServices();
    }
    
    private void initServices() {
        HoaDonService = HoaDonService.getInstance();
        NhanVienService = NhanVienService.getInstance();
        HoaDonService = HoaDonService.getInstance();
    }
}
