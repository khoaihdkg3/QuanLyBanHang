package Service;

import Model.ChiTietHoaDon;
import Model.HoaDon;
import Model.NhanVien;
import Model.SanPham;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public boolean addHoaDon(HoaDon hoadon) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO `hoadon` (`HD_MA`, `NV_MA`, `HD_THOIGIANLAP`) "
                + "VALUES (? , ?, (select NOW()));";
        PreparedStatement pStatement = Database.getInstance().prepareStatement(sql);
        String mahd = createMaHoaDon();
        hoadon.setMa(mahd);
        pStatement.setString(1, mahd);
        pStatement.setString(2, hoadon.getNhanVien().getMa());
        //pStatement.setDate(3,hoadon.getThoiGianLap());
        if (pStatement.executeUpdate() > 0) {
            int stt = 1;
            for (ChiTietHoaDon cthd : hoadon.getChiTietHoaDon()) {
                addChiTietHoaDon(hoadon.getMa(), stt, cthd);
                stt += 1;
            }
            return true;
        }
        return false;
    }
    public boolean addChiTietHoaDon(String ma_hd, int stt, ChiTietHoaDon cthd) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO `chitiethd` (`SP_MA`, `HD_MA`, `CTHD_STT`, `CTHD_SOLUONG`, `CTHD_TONGTIEN`) "
                + "VALUES (?, ?, ?, ?, ?);";
        PreparedStatement pStatement = Database.getInstance().prepareStatement(sql);
        pStatement.setString(1, cthd.getSanPham().getMa());
        pStatement.setString(2, ma_hd);
        pStatement.setInt(3, stt);
        pStatement.setFloat(4, cthd.getSoLuong());
        pStatement.setFloat(5, cthd.getTongTien());
        return pStatement.executeUpdate() > 0;
    }
    private String createMaHoaDon() {
        Random r = new Random();
        String alphabet = "12345678901234567890";
        String result = "";
        for (int i = 0; i < 5; i++) {
            result += alphabet.charAt(r.nextInt(alphabet.length()));
        }
        return result;
    }
    public ArrayList<HoaDon> getHoaDonByDate(Date ngaybatdau, Date ngayketthuc) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM `hoadon`,`nhanvien` "
                + "WHERE (HD_THOIGIANLAP BETWEEN ? and ?) and nhanvien.NV_MA = hoadon.NV_MA";
        PreparedStatement pStatement = Database.getInstance().prepareStatement(sql);
        pStatement.setDate(1, ngaybatdau);
        pStatement.setDate(2, ngayketthuc);
        
        ResultSet resultSet = pStatement.executeQuery();
        ArrayList<HoaDon> hdList = new ArrayList<>();
        while (resultSet.next()) {
            HoaDon hd = ResultSet_toHoaDon(resultSet);
            hdList.add(hd);
        }
        return hdList;
    }
    public HoaDon ResultSet_toHoaDon(ResultSet rs) throws SQLException, ClassNotFoundException {
        String ma = rs.getString("hd_ma");
        Date thoigianlap = rs.getDate("hd_thoigianlap");
        NhanVien nhanvien = NhanVienService.getInstance().ResultSet_toNhanVien(rs);
        ArrayList<ChiTietHoaDon> cthdList = getChiTietHoaDonByMaHoaDon(ma);
        HoaDon hd = new HoaDon(nhanvien);
        hd.setMa(ma);
        hd.setThoiGianLap(thoigianlap);
        hd.setChiTietHoaDon(cthdList);
        return hd;
    }
    public ArrayList<ChiTietHoaDon> getChiTietHoaDonByMaHoaDon(String ma_hd) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM `chitiethd` where HD_MA = ?";
        PreparedStatement pStatement = Database.getInstance().prepareStatement(sql);
        pStatement.setString(1, ma_hd);
        ResultSet resultSet = pStatement.executeQuery();
        ArrayList<ChiTietHoaDon> cthdList = new ArrayList<>();
        while(resultSet.next()){
            cthdList.add(ResultSet_toChiTietHoaDon(resultSet));
        }
        return cthdList;
    }
    public ChiTietHoaDon ResultSet_toChiTietHoaDon(ResultSet rs) throws SQLException, ClassNotFoundException {
        String ma_sp = rs.getString("sp_ma");
        float sl_sp = rs.getFloat("cthd_soluong");
        float tongtien_sp = rs.getFloat("cthd_tongtien");
        SanPham sanpham = SanPhamService.getInstance().getSanPhamByMaSanPham(ma_sp);
        ChiTietHoaDon cthd = new ChiTietHoaDon(sanpham, sl_sp, tongtien_sp);
        return cthd;
    }
    public ArrayList<HoaDon> getHoaDonByMaNhanVien(String ma_nhanvien) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM `hoadon`,`nhanvien` "
                + "WHERE hoadon.NV_MA = ? and nhanvien.NV_MA = hoadon.NV_MA";
        PreparedStatement pStatement = Database.getInstance().prepareStatement(sql);
        pStatement.setInt(1, Integer.parseInt(ma_nhanvien));
        
        ResultSet resultSet = pStatement.executeQuery();
        ArrayList<HoaDon> hdList = new ArrayList<>();
        while (resultSet.next()) {
            HoaDon hd = ResultSet_toHoaDon(resultSet);
            hdList.add(hd);
        }
        return hdList;
    }

    public Date createDate(String year, String month, String day){
        return Date.valueOf(year+"-"+month+"-"+day);
    }

}
