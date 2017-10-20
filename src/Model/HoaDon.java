package Model;

import java.sql.Date;
import java.util.ArrayList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class HoaDon {
    private String ma;
    private Date ThoiGianLap;
    private NhanVien NhanVien;
    private ArrayList<ChiTietHoaDon> ChiTietHoaDon;

    public HoaDon(NhanVien NhanVien) {
        this.NhanVien = NhanVien;
    }
    
    public String getMa() {
        return ma;
    }

    public NhanVien getNhanVien() {
        return NhanVien;
    }

    public Date getThoiGianLap() {
        return ThoiGianLap;
    }

    public ArrayList<ChiTietHoaDon> getChiTietHoaDon() {
        return ChiTietHoaDon;
    }
    
    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setNhanVien(NhanVien NhanVien) {
        this.NhanVien = NhanVien;
    }

    public void setThoiGianLap(Date ThoiGianLap) {
        this.ThoiGianLap = ThoiGianLap;
    }

    public void setChiTietHoaDon(ArrayList<ChiTietHoaDon> ChiTietHoaDon) {
        this.ChiTietHoaDon = ChiTietHoaDon;
    }

    @Override
    public String toString() {
        return getMa()+"|"+getThoiGianLap();
    }
    
}
