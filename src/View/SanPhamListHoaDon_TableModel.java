/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.SanPham;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author student
 */
public class SanPhamListHoaDon_TableModel extends AbstractTableModel {

    private final ArrayList<SanPham> SanPhamList;
    private final String[] columnNames = {"Mã sản phẩm", "Tên sản phẩm", "Đơn vị tính",
        "Đơn giá"};
    private final int MASANPHAM_COL = 0;
    private final int TENSANPHAM_COL = 1;
    private final int DONVITINH_COL = 2;
    private final int DONGIA_COL = 3;

    public SanPhamListHoaDon_TableModel(ArrayList<SanPham> SanPhamList) {
        this.SanPhamList = SanPhamList;
    }

    @Override
    public int getRowCount() {
        return SanPhamList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        switch (i1) {
            case MASANPHAM_COL:
                return SanPhamList.get(i).getMa();
            case TENSANPHAM_COL:
                return SanPhamList.get(i).getTen();
            case DONVITINH_COL:
                return SanPhamList.get(i).getLoaiSanPham().getDonViTinh();
            case DONGIA_COL:
                return SanPhamList.get(i).getDonGiaBan();
            default:
                return null;
        }
    }
}
