
package View;
public class QuanLyView extends SubViewer {
    public QuanLyView(GiaoDienChinhView parentView) {
        super(parentView);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_qlnv = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton_sua_qlnv = new javax.swing.JButton();
        jButton_xuat_qlnv = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTextField_timkiem_qlnv = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_qlsp = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jTextField_timkiem_qlsp = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jButton_xoa_qlsp = new javax.swing.JButton();
        jButton_sua_qlsp = new javax.swing.JButton();
        jButton_them_qlsp = new javax.swing.JButton();
        jButton_xuat_qlsp = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jButton_xoa_ncc = new javax.swing.JButton();
        jButton_sua_ncc = new javax.swing.JButton();
        jButton_them_ncc = new javax.swing.JButton();
        jButton_xuat_ncc = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_ncc = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jTextField_timkiem_ncc = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jTextField_qltk = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable_qltk = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jButton_xoa_qltk = new javax.swing.JButton();
        jButton_sua_qltk = new javax.swing.JButton();
        jButton_them_qltk = new javax.swing.JButton();
        jButton_xuat_qltk = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        jComboBox_qlvt = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_qlvt = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jButton_xoa_qlvt = new javax.swing.JButton();
        jButton_sua_qlvt = new javax.swing.JButton();
        jButton_them_qlvt = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton_tonkho = new javax.swing.JButton();
        jButton_tkdoanhthu = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jFormattedTextField_ngaybd_tk = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jFormattedTextField_ngaykt_tk = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Quản lý");

        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.BorderLayout());

        jTable_qlnv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tên Nhân Viên", "Tên tài khoản", "Quyền", "Số tài khoản", "Địa chỉ", "Số điện thoại", "Email", "Giới tính", "Truy cập gần nhất"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable_qlnv);

        jPanel4.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jButton_sua_qlnv.setText("Sửa");

        jButton_xuat_qlnv.setText("Xuất");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 431, Short.MAX_VALUE)
                .addComponent(jButton_xuat_qlnv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_sua_qlnv, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_sua_qlnv)
                    .addComponent(jButton_xuat_qlnv)))
        );

        jPanel4.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_timkiem_qlnv.setText("Tìm kiếm..");
        jPanel5.add(jTextField_timkiem_qlnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 130, -1));

        jPanel2.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.addTab("Quản lý Nhân viên", jPanel2);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jTable_qlsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Loại", "Đơn vị tính"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable_qlsp);

        jPanel6.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_timkiem_qlsp.setText("Tìm kiếm..");
        jPanel7.add(jTextField_timkiem_qlsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 130, -1));

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jButton_xoa_qlsp.setText("Xóa");

        jButton_sua_qlsp.setText("Sửa");

        jButton_them_qlsp.setText("Thêm mới");

        jButton_xuat_qlsp.setText("Xuất");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jButton_xoa_qlsp, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(jButton_xuat_qlsp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_sua_qlsp, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_them_qlsp, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_them_qlsp)
                    .addComponent(jButton_sua_qlsp)
                    .addComponent(jButton_xoa_qlsp)
                    .addComponent(jButton_xuat_qlsp)))
        );

        jPanel6.add(jPanel8, java.awt.BorderLayout.PAGE_END);

        jTabbedPane1.addTab("Quản lý Sản phẩm", jPanel6);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton_xoa_ncc.setText("Xóa");

        jButton_sua_ncc.setText("Sửa");

        jButton_them_ncc.setText("Thêm mới");

        jButton_xuat_ncc.setText("Xuất");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addComponent(jButton_xoa_ncc, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(jButton_xuat_ncc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_sua_ncc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_them_ncc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_them_ncc)
                    .addComponent(jButton_sua_ncc)
                    .addComponent(jButton_xoa_ncc)
                    .addComponent(jButton_xuat_ncc)))
        );

        jPanel9.add(jPanel19, java.awt.BorderLayout.PAGE_END);

        jTable_ncc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tên", "Địa chỉ", "Số điện thoại", "Mã số thuế", "Fax", "Người liên hệ", "Số tài khoản"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable_ncc);

        jPanel9.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_timkiem_ncc.setText("Tìm kiếm..");
        jPanel15.add(jTextField_timkiem_ncc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 130, -1));

        jPanel9.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.addTab("Quản lý Nhà cung cấp", jPanel9);

        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_qltk.setText("Tìm kiếm..");
        jPanel17.add(jTextField_qltk, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 130, -1));

        jPanel13.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jTable_qltk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Tên Nhân Viên", "Tên tài khoản", "Mật Khẩu", "Quyền", "Truy cập gần nhất"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable_qltk);

        jPanel13.add(jScrollPane7, java.awt.BorderLayout.CENTER);

        jButton_xoa_qltk.setText("Xóa");

        jButton_sua_qltk.setText("Sửa");

        jButton_them_qltk.setText("Thêm mới");

        jButton_xuat_qltk.setText("Xuất");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addComponent(jButton_xoa_qltk, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(jButton_xuat_qltk, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_sua_qltk, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_them_qltk, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_them_qltk)
                    .addComponent(jButton_sua_qltk)
                    .addComponent(jButton_xoa_qltk)
                    .addComponent(jButton_xuat_qltk)))
        );

        jPanel13.add(jPanel18, java.awt.BorderLayout.PAGE_END);

        jTabbedPane1.addTab("Quản lý Tài khoản", jPanel13);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jComboBox_qlvt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản Lý", "Nhân Viên Bán Hàng" }));
        jToolBar2.add(jComboBox_qlvt);

        jPanel12.add(jToolBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 130, 20));

        jPanel11.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jTable_qlvt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Quyền", "Diễn Giải"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable_qlvt);

        jPanel11.add(jScrollPane6, java.awt.BorderLayout.CENTER);

        jButton_xoa_qlvt.setText("Xóa");

        jButton_sua_qlvt.setText("Sửa");

        jButton_them_qlvt.setText("Thêm mới");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addComponent(jButton_xoa_qlvt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                .addComponent(jButton_sua_qlvt, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_them_qlvt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_them_qlvt)
                    .addComponent(jButton_sua_qlvt)
                    .addComponent(jButton_xoa_qlvt)))
        );

        jPanel11.add(jPanel16, java.awt.BorderLayout.PAGE_END);

        jTabbedPane1.addTab("Quản lý Vai trò", jPanel11);

        jButton_tonkho.setText("Thống kê tồn kho");

        jButton_tkdoanhthu.setText("Thống kê doanh thu");

        jLabel12.setText("Từ ngày");

        try {
            jFormattedTextField_ngaybd_tk.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel10.setText("đến");

        try {
            jFormattedTextField_ngaykt_tk.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_tkdoanhthu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_tonkho, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField_ngaybd_tk, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField_ngaykt_tk, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jFormattedTextField_ngaybd_tk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField_ngaykt_tk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_tkdoanhthu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_tonkho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thống kê", jPanel14);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel10, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_sua_ncc;
    private javax.swing.JButton jButton_sua_qlnv;
    private javax.swing.JButton jButton_sua_qlsp;
    private javax.swing.JButton jButton_sua_qltk;
    private javax.swing.JButton jButton_sua_qlvt;
    private javax.swing.JButton jButton_them_ncc;
    private javax.swing.JButton jButton_them_qlsp;
    private javax.swing.JButton jButton_them_qltk;
    private javax.swing.JButton jButton_them_qlvt;
    private javax.swing.JButton jButton_tkdoanhthu;
    private javax.swing.JButton jButton_tonkho;
    private javax.swing.JButton jButton_xoa_ncc;
    private javax.swing.JButton jButton_xoa_qlsp;
    private javax.swing.JButton jButton_xoa_qltk;
    private javax.swing.JButton jButton_xoa_qlvt;
    private javax.swing.JButton jButton_xuat_ncc;
    private javax.swing.JButton jButton_xuat_qlnv;
    private javax.swing.JButton jButton_xuat_qlsp;
    private javax.swing.JButton jButton_xuat_qltk;
    private javax.swing.JComboBox<String> jComboBox_qlvt;
    private javax.swing.JFormattedTextField jFormattedTextField_ngaybd_tk;
    private javax.swing.JFormattedTextField jFormattedTextField_ngaykt_tk;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable_ncc;
    private javax.swing.JTable jTable_qlnv;
    private javax.swing.JTable jTable_qlsp;
    private javax.swing.JTable jTable_qltk;
    private javax.swing.JTable jTable_qlvt;
    private javax.swing.JTextField jTextField_qltk;
    private javax.swing.JTextField jTextField_timkiem_ncc;
    private javax.swing.JTextField jTextField_timkiem_qlnv;
    private javax.swing.JTextField jTextField_timkiem_qlsp;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}