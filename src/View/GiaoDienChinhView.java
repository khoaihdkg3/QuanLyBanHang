package View;

import Model.HoaDon;
import Model.NhanVien;
import Model.SanPham;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GiaoDienChinhView extends Viewer {

    private final DangNhapView DangNhapView;

    public GiaoDienChinhView(DangNhapView parentView) {
        super();
        this.DangNhapView = parentView;

        initComponents();
        initSubView();
        initModel();
        startAutoUpdateNgayNhapTextField();
    }

    private void initSubView() {
        QuanLyView = new QuanLyView(this);
        SuaNhanVienView = new SuaNhanVienView(this);
        TaoNhaCungCapView = new TaoNhaCungCapView(this);
        TaoSanPhamView = new TaoSanPhamView(this);
        TaoTaiKhoanView = new TaoTaiKhoanView(this);
        TaoVaiTroView = new TaoVaiTroView(this);
        ThongTinNhanVienView = new ThongTinNhanVienView(this);
    }

    private void initModel() {
        try {
            ArrayList<SanPham> sanphamList = SanPhamService.getAllSanPham();
            upateSanPhamList_HoaDonPanel(sanphamList);
            updateSanPhamList_SanPhamNhap(sanphamList);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(GiaoDienChinhView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void upateSanPhamList_HoaDonPanel(ArrayList<SanPham> sanphamList) throws ClassNotFoundException, SQLException {
        SanPhamListHoaDon_TableModel modelSanPhamListHoaDon = new SanPhamListHoaDon_TableModel(sanphamList);
        jTable_dssp_hd.setModel(modelSanPhamListHoaDon);
    }

    public void updateSanPhamList_SanPhamNhap(ArrayList<SanPham> sanphamList) throws ClassNotFoundException, SQLException {
        SanPhamListHoaDon_TableModel modelSanPhamListSanPhamNhap = new SanPhamListHoaDon_TableModel(sanphamList);
        String[] columnNames = {"Mã sản phẩm", "Tên sản phẩm", "Đơn vị tính"};
        modelSanPhamListSanPhamNhap.setColumnNames(columnNames);
        jTable_dssp_spn.setModel(modelSanPhamListSanPhamNhap);
    }

    public void updateHoaDonList(ArrayList<HoaDon> hoadonList) throws ClassNotFoundException, SQLException {
        HoaDonList_TableModel modelHoaDonList = new HoaDonList_TableModel(hoadonList);
        jTable_hoadon.setModel(modelHoaDonList);
    }

    public void updateNhanVien(NhanVien nhanvien) {
        String TenNhanVien = nhanvien.getTen();
        jTextField_ttnhanvien_bh.setText(TenNhanVien);
        jTextField_ttnhanvien_spn.setText(TenNhanVien);
       currentNhanVien = nhanvien;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        jButton_quanly = new javax.swing.JButton();
        jButton_thongtincanhan = new javax.swing.JButton();
        jButton_dangxuat = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_dssp_hd = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jTextField_timkiem_bh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton_lammoisp_hd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jFormattedTextField_thanhtien_bh = new javax.swing.JFormattedTextField();
        jFormattedTextField_tongtien_bh = new javax.swing.JFormattedTextField();
        jFormattedTextField_tiennhan_bh = new javax.swing.JFormattedTextField();
        jFormattedTextField_tientra_bh = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jSpinner_vat = new javax.swing.JSpinner();
        jSpinner_chietkhau_bh = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_mahoadon_bh = new javax.swing.JTextField();
        jTextField_ngaylap_bh = new javax.swing.JTextField();
        jTextField_ttnhanvien_bh = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_chitiethoadon = new javax.swing.JTable();
        jButton_xoahd_bh = new javax.swing.JButton();
        jButton_xuathd_bh = new javax.swing.JButton();
        jButton_xoatatcahd_bh = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_dssp_spn = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jTextField_timkiem_spn = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField_ngaynhap_spn = new javax.swing.JTextField();
        jTextField_ttnhanvien_spn = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_chitietsp_spn = new javax.swing.JTable();
        jButton_xoasp_spn = new javax.swing.JButton();
        jButton_xoatatca_spn = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_hoadon = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jTextField_timkiem_hd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jFormattedTextField_ngaybd_hd = new javax.swing.JFormattedTextField();
        jFormattedTextField_ngaykt_hd = new javax.swing.JFormattedTextField();
        jButton_xem_hd = new javax.swing.JButton();
        jButton_in_hd = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý bán rau củ quả");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel17.setLayout(new java.awt.BorderLayout());

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jButton_quanly.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_quanly.setForeground(new java.awt.Color(0, 102, 0));
        jButton_quanly.setText("Quản lý viên");
        jButton_quanly.setFocusable(false);
        jButton_quanly.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_quanly.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_quanly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_quanlyActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton_quanly);

        jButton_thongtincanhan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_thongtincanhan.setForeground(new java.awt.Color(0, 102, 0));
        jButton_thongtincanhan.setText("Thông tin cá nhân");
        jButton_thongtincanhan.setFocusable(false);
        jButton_thongtincanhan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_thongtincanhan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_thongtincanhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_thongtincanhanActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton_thongtincanhan);

        jButton_dangxuat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_dangxuat.setText("Đăng xuất");
        jButton_dangxuat.setFocusable(false);
        jButton_dangxuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_dangxuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_dangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_dangxuatActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton_dangxuat);

        jPanel17.add(jToolBar2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel5.setLayout(new java.awt.BorderLayout());

        jTable_dssp_hd.setAutoCreateRowSorter(true);
        jTable_dssp_hd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Đơn vị tính", "Đơn giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_dssp_hd);

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jTextField_timkiem_bh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_timkiem_bh.setText("Tìm kiếm..");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Danh sách sản phẩm");
        jLabel4.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jButton_lammoisp_hd.setText("Làm mới");
        jButton_lammoisp_hd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lammoisp_hdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton_lammoisp_hd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_timkiem_bh, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_timkiem_bh, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_lammoisp_hd)))
        );

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jLabel6.setText("     ");
        jPanel5.add(jLabel6, java.awt.BorderLayout.LINE_START);

        jLabel7.setText("   ");
        jPanel5.add(jLabel7, java.awt.BorderLayout.LINE_END);

        jPanel3.add(jPanel5);

        jFormattedTextField_thanhtien_bh.setEditable(false);
        jFormattedTextField_thanhtien_bh.setForeground(new java.awt.Color(255, 0, 0));
        jFormattedTextField_thanhtien_bh.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###"))));
        jFormattedTextField_thanhtien_bh.setText("0");
        jFormattedTextField_thanhtien_bh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jFormattedTextField_tongtien_bh.setEditable(false);
        jFormattedTextField_tongtien_bh.setForeground(new java.awt.Color(255, 0, 0));
        jFormattedTextField_tongtien_bh.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###"))));
        jFormattedTextField_tongtien_bh.setText("0");
        jFormattedTextField_tongtien_bh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jFormattedTextField_tiennhan_bh.setForeground(new java.awt.Color(0, 153, 0));
        jFormattedTextField_tiennhan_bh.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###"))));
        jFormattedTextField_tiennhan_bh.setText("0");
        jFormattedTextField_tiennhan_bh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jFormattedTextField_tientra_bh.setEditable(false);
        jFormattedTextField_tientra_bh.setForeground(new java.awt.Color(255, 0, 0));
        jFormattedTextField_tientra_bh.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###"))));
        jFormattedTextField_tientra_bh.setText("0");
        jFormattedTextField_tientra_bh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("VAT %");

        jSpinner_vat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinner_vat.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(10), null, null, Integer.valueOf(1)));

        jSpinner_chietkhau_bh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinner_chietkhau_bh.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), null, null, Float.valueOf(0.5f)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Chiết khấu %");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Mã hóa đơn");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ngày lập");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nhân viên");

        jTextField_mahoadon_bh.setEditable(false);
        jTextField_mahoadon_bh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_mahoadon_bh.setText("MSHD");

        jTextField_ngaylap_bh.setEditable(false);
        jTextField_ngaylap_bh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_ngaylap_bh.setText("dd/mm/yyyy hh:mm");

        jTextField_ttnhanvien_bh.setEditable(false);
        jTextField_ttnhanvien_bh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_ttnhanvien_bh.setForeground(new java.awt.Color(0, 102, 0));
        jTextField_ttnhanvien_bh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_ttnhanvien_bh.setText("MANV-TENNV");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Thành tiền");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Tổng tiền");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Tiền nhận");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Tiền trả");

        jTable_chitiethoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tên sản phẩm", "Đơn vị tính", "Đơn giá", "Số lượng", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable_chitiethoadon);

        jButton_xoahd_bh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_xoahd_bh.setForeground(new java.awt.Color(255, 0, 0));
        jButton_xoahd_bh.setText("Xóa");
        jButton_xoahd_bh.setPreferredSize(new java.awt.Dimension(73, 23));

        jButton_xuathd_bh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_xuathd_bh.setForeground(new java.awt.Color(0, 153, 0));
        jButton_xuathd_bh.setText("Xuất hóa đơn");

        jButton_xoatatcahd_bh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_xoatatcahd_bh.setForeground(new java.awt.Color(255, 0, 0));
        jButton_xoatatcahd_bh.setText("Xóa tất cả");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Hóa đơn bán hàng");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextField_mahoadon_bh, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_ngaylap_bh))
                            .addComponent(jTextField_ttnhanvien_bh)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton_xuathd_bh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_xoahd_bh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_xoatatcahd_bh))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextField_tiennhan_bh, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextField_tientra_bh)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jFormattedTextField_thanhtien_bh, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextField_tongtien_bh))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner_chietkhau_bh, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner_vat, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jSpinner_chietkhau_bh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jSpinner_vat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_mahoadon_bh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ngaylap_bh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_ttnhanvien_bh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextField_thanhtien_bh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextField_tongtien_bh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextField_tiennhan_bh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextField_tientra_bh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_xoahd_bh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_xuathd_bh, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_xoatatcahd_bh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Bán hàng", jPanel2);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setLayout(new java.awt.GridLayout(1, 0));

        jPanel13.setLayout(new java.awt.BorderLayout());

        jTable_dssp_spn.setAutoCreateRowSorter(true);
        jTable_dssp_spn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Đơn vị tính"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable_dssp_spn);

        jPanel13.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jTextField_timkiem_spn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_timkiem_spn.setText("Tìm kiếm..");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("Danh sách sản phẩm");
        jLabel15.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jButton1.setText("Làm mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_timkiem_spn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_timkiem_spn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)))
        );

        jPanel13.add(jPanel14, java.awt.BorderLayout.PAGE_START);

        jLabel16.setText("     ");
        jPanel13.add(jLabel16, java.awt.BorderLayout.LINE_START);

        jLabel19.setText("   ");
        jPanel13.add(jLabel19, java.awt.BorderLayout.LINE_END);

        jPanel12.add(jPanel13);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Ngày nhập");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Nhân viên");

        jTextField_ngaynhap_spn.setEditable(false);
        jTextField_ngaynhap_spn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_ngaynhap_spn.setText("dd/mm/yyyy hh:mm");

        jTextField_ttnhanvien_spn.setEditable(false);
        jTextField_ttnhanvien_spn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_ttnhanvien_spn.setForeground(new java.awt.Color(0, 102, 0));
        jTextField_ttnhanvien_spn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_ttnhanvien_spn.setText("MANV-TENNV");

        jTable_chitietsp_spn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tên sản phẩm", "Đơn vị tính", "Đơn giá", "Số lượng", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable_chitietsp_spn);

        jButton_xoasp_spn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_xoasp_spn.setForeground(new java.awt.Color(255, 0, 0));
        jButton_xoasp_spn.setText("Xóa");
        jButton_xoasp_spn.setPreferredSize(new java.awt.Dimension(73, 23));

        jButton_xoatatca_spn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_xoatatca_spn.setForeground(new java.awt.Color(255, 0, 0));
        jButton_xoatatca_spn.setText("Xóa tất cả");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 102));
        jLabel29.setText("Sản phẩm nhập");
        jLabel29.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_xoasp_spn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_xoatatca_spn))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_ttnhanvien_spn)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jTextField_ngaynhap_spn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField_ngaynhap_spn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField_ttnhanvien_spn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_xoasp_spn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_xoatatca_spn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel15);

        jPanel11.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel11, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Sản phẩm nhập", jPanel10);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jTable_hoadon.setAutoCreateRowSorter(true);
        jTable_hoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Ngày lập", "Nhân viên lập", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable_hoadon);

        jPanel7.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jTextField_timkiem_hd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_timkiem_hd.setText("Tìm kiếm..");

        jLabel10.setText("đến");

        jLabel12.setText("Từ ngày");

        try {
            jFormattedTextField_ngaybd_hd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField_ngaybd_hd.setText("2017-10-18");

        try {
            jFormattedTextField_ngaykt_hd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField_ngaykt_hd.setText("2017-10-20");

        jButton_xem_hd.setText("Xem");
        jButton_xem_hd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_xem_hdActionPerformed(evt);
            }
        });

        jButton_in_hd.setText("In");
        jButton_in_hd.setEnabled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField_ngaybd_hd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField_ngaykt_hd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_xem_hd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_in_hd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(jTextField_timkiem_hd, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_timkiem_hd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jFormattedTextField_ngaybd_hd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField_ngaykt_hd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_xem_hd)
                    .addComponent(jButton_in_hd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jLabel11.setText("   ");
        jPanel7.add(jLabel11, java.awt.BorderLayout.LINE_END);

        jPanel9.setLayout(new java.awt.BorderLayout());
        jPanel7.add(jPanel9, java.awt.BorderLayout.LINE_START);

        jTabbedPane1.addTab("Hóa đơn", jPanel7);

        jPanel1.add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_quanlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_quanlyActionPerformed
        showQuanTri();
    }//GEN-LAST:event_jButton_quanlyActionPerformed

    private void jButton_thongtincanhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_thongtincanhanActionPerformed
        showNhanVienProfile();
    }//GEN-LAST:event_jButton_thongtincanhanActionPerformed

    private void jButton_dangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_dangxuatActionPerformed
        DangNhapView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_dangxuatActionPerformed

    private void jButton_lammoisp_hdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lammoisp_hdActionPerformed
        try {
            ArrayList<SanPham> sanphamList = SanPhamService.getAllSanPham();
            upateSanPhamList_HoaDonPanel(sanphamList);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(GiaoDienChinhView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_lammoisp_hdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ArrayList<SanPham> sanphamList = SanPhamService.getAllSanPham();
            updateSanPhamList_SanPhamNhap(sanphamList);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(GiaoDienChinhView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_xem_hdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_xem_hdActionPerformed
        String txtNgayBatDau = jFormattedTextField_ngaybd_hd.getText();
        String txtNgayKetThuc = jFormattedTextField_ngaykt_hd.getText();
        Date NgayBatDau = Date.valueOf(txtNgayBatDau);
        Date NgayKetThuc = Date.valueOf(txtNgayKetThuc);
        try {
            ArrayList<HoaDon> hoadonList = HoaDonService.getHoaDonByDate(NgayBatDau, NgayKetThuc);
            updateHoaDonList(hoadonList);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(GiaoDienChinhView.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton_xem_hdActionPerformed
    public void showNhanVienProfile() {
        ThongTinNhanVienView.updateNhanVien(currentNhanVien);
        ThongTinNhanVienView.setVisible(true);
        this.setEnabled(false);
    }

    public void showQuanTri() {

        QuanLyView.setVisible(true);
        QuanLyView.updateNhanVien(currentNhanVien);
        this.setEnabled(false);
    }

    private QuanLyView QuanLyView;
    private SuaNhanVienView SuaNhanVienView;
    private TaoNhaCungCapView TaoNhaCungCapView;
    private TaoSanPhamView TaoSanPhamView;
    private TaoTaiKhoanView TaoTaiKhoanView;
    private TaoVaiTroView TaoVaiTroView;
    private ThongTinNhanVienView ThongTinNhanVienView;
    private NhanVien currentNhanVien;

    public void startAutoUpdateNgayNhapTextField() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    long time_now = System.currentTimeMillis();
                    String nowDate = new Date(time_now).toString();
                    String nowTime = new Time(time_now).toString();
                    jTextField_ngaylap_bh.setText(nowDate + " " + nowTime);
                    jTextField_ngaynhap_spn.setText(nowDate + " " + nowTime);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GiaoDienChinhView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        thread.start();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_dangxuat;
    private javax.swing.JButton jButton_in_hd;
    private javax.swing.JButton jButton_lammoisp_hd;
    private javax.swing.JButton jButton_quanly;
    private javax.swing.JButton jButton_thongtincanhan;
    private javax.swing.JButton jButton_xem_hd;
    private javax.swing.JButton jButton_xoahd_bh;
    private javax.swing.JButton jButton_xoasp_spn;
    private javax.swing.JButton jButton_xoatatca_spn;
    private javax.swing.JButton jButton_xoatatcahd_bh;
    private javax.swing.JButton jButton_xuathd_bh;
    private javax.swing.JFormattedTextField jFormattedTextField_ngaybd_hd;
    private javax.swing.JFormattedTextField jFormattedTextField_ngaykt_hd;
    private javax.swing.JFormattedTextField jFormattedTextField_thanhtien_bh;
    private javax.swing.JFormattedTextField jFormattedTextField_tiennhan_bh;
    private javax.swing.JFormattedTextField jFormattedTextField_tientra_bh;
    private javax.swing.JFormattedTextField jFormattedTextField_tongtien_bh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner_chietkhau_bh;
    private javax.swing.JSpinner jSpinner_vat;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable_chitiethoadon;
    private javax.swing.JTable jTable_chitietsp_spn;
    private javax.swing.JTable jTable_dssp_hd;
    private javax.swing.JTable jTable_dssp_spn;
    private javax.swing.JTable jTable_hoadon;
    private javax.swing.JTextField jTextField_mahoadon_bh;
    private javax.swing.JTextField jTextField_ngaylap_bh;
    private javax.swing.JTextField jTextField_ngaynhap_spn;
    private javax.swing.JTextField jTextField_timkiem_bh;
    private javax.swing.JTextField jTextField_timkiem_hd;
    private javax.swing.JTextField jTextField_timkiem_spn;
    private javax.swing.JTextField jTextField_ttnhanvien_bh;
    private javax.swing.JTextField jTextField_ttnhanvien_spn;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}
