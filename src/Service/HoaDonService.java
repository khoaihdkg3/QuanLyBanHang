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

    /**
     * Thêm một hóa đơn vào cơ sở dữ liệu.
     * @param hoadon dữ liệu HoaDon
     * @return True nếu thành công, False nếu thất bại.
     * @throws ClassNotFoundException
     * @throws SQLException
     */
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

    /**
     * Thêm một chi tiết hóa đơn vào cơ sở dữ liệu.
     * @param ma_hd mã của hóa đơn
     * @param stt số thứ tự của sản phẩm trong hóa đơn
     * @param cthd đối tượng ChiTietHoaDon
     * @return True nếu thành công, False nếu thất bại.
     * @throws SQLException
     * @throws ClassNotFoundException
     */
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

    /**
     * Lấy danh sách Hóa đơn theo ngày.
     * @param ngaybatdau ngày bắt đầu tính
     * @param ngayketthuc ngày kết thúc tính
     * @return danh sách Hóa đơn, danh sách rỗng nếu không tìm thấy hóa đơn nào.
     * @throws SQLException
     * @throws ClassNotFoundException
     */
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

    /**
     * Chuyển kiểu dữ liệu ResultSet sang kiểu dữ liệu HoaDon
     * @param rs dữ liệu ResultSet với đầy đủ cột của bảng HoaDon
     * @return dữ liệu HoaDon
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public HoaDon ResultSet_toHoaDon(ResultSet rs) throws SQLException, ClassNotFoundException {
        String ma = rs.getString("hd_ma");
        Date thoigianlap = rs.getDate("hd_thoigianlap");
        NhanVien nhanvien = NhanVienService.getInstance().ResultSet_toNhanVien(rs);
        ArrayList<ChiTietHoaDon> cthdList = getChiTietHoaDonByMaHoaDon(ma);
        float TongTien = sumTongTienChiTietHoaDon(cthdList);
        HoaDon hd = new HoaDon(nhanvien);
        hd.setMa(ma);
        hd.setTongTien(TongTien);
        hd.setThoiGianLap(thoigianlap);
        hd.setChiTietHoaDon(cthdList);
        return hd;
    }
    public float sumTongTienChiTietHoaDon(ArrayList<ChiTietHoaDon> cthdList){
        float TongTien = 0;
        for(ChiTietHoaDon cthd : cthdList){
            TongTien += cthd.getTongTien();
        }
        return TongTien;
    }
    /**
     *
     * @param ma_hd
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
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

    /**
     *
     * @param rs
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public ChiTietHoaDon ResultSet_toChiTietHoaDon(ResultSet rs) throws SQLException, ClassNotFoundException {
        String ma_sp = rs.getString("sp_ma");
        float sl_sp = rs.getFloat("cthd_soluong");
        float tongtien_sp = rs.getFloat("cthd_tongtien");
        SanPham sanpham = SanPhamService.getInstance().getSanPhamByMaSanPham(ma_sp);
        ChiTietHoaDon cthd = new ChiTietHoaDon(sanpham, sl_sp, tongtien_sp);
        return cthd;
    }

    /**
     *
     * @param ma_nhanvien
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
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

    /**
     *
     * @param year
     * @param month
     * @param day
     * @return
     */
    public Date createDate(String year, String month, String day){
        return Date.valueOf(year+"-"+month+"-"+day);
    }

}
