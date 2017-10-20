package View;

import Service.HoaDonService;
import Service.NhanVienService;
import Service.SanPhamService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

public class Viewer extends javax.swing.JFrame {

    protected HoaDonService HoaDonService;
    protected NhanVienService NhanVienService;
    protected SanPhamService SanPhamService;

    public Viewer() {
        applyWindowTheme();
        initServices();
    }

    private void initServices() {
        HoaDonService = HoaDonService.getInstance();
        NhanVienService = NhanVienService.getInstance();
        SanPhamService = SanPhamService.getInstance();
    }

    private void applyWindowTheme() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GiaoDienChinhView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
