/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Model.HoaDon;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author student
 */
public class HoaDonList_TableModel extends AbstractTableModel{
    
    private final ArrayList<HoaDon> HoaDonList;
    protected String[] columnNames = {"Mã hóa đơn", "Ngày lập", "Nhân viên lập", "Tổng tiền"};
    private final int MAHOADON_COL = 0;
    private final int NGAYLAP_COL = 1;
    private final int NHANVIENLAP_COL = 2;
    private final int TONGTIEN_COL = 3;

    public HoaDonList_TableModel(ArrayList<HoaDon> HoaDonList) {
        this.HoaDonList = HoaDonList;
    }
    public void setColumnNames(String[] columnNames){
        this.columnNames = columnNames;
    }
    @Override
    public int getRowCount() {
        return HoaDonList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        switch (i1) {
            case MAHOADON_COL:
                return HoaDonList.get(i).getMa();
            case NGAYLAP_COL:
                return HoaDonList.get(i).getThoiGianLap();
            case NHANVIENLAP_COL:
                return HoaDonList.get(i).getNhanVien().getTen();
            case TONGTIEN_COL:
                return HoaDonList.get(i).getTongTien();
            default:
                return null;
        }
    }
    
    public String[] getColumnNames() {
        return columnNames;
    }

    @Override
    public String getColumnName(int i) {
        return columnNames[i];
    }
    
}
