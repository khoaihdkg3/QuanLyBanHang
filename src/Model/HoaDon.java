package Model;


import java.util.Date;

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
    private ChiTietHoaDon[] ChiTietHoaDon;

    public HoaDon(String ma, Date ThoiGianLap, NhanVien NhanVien, ChiTietHoaDon[] ChiTietHoaDon) {
        this.ma = ma;
        this.ThoiGianLap = ThoiGianLap;
        this.NhanVien = NhanVien;
        this.ChiTietHoaDon = ChiTietHoaDon;
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

    public ChiTietHoaDon[] getChiTietHoaDon() {
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

    public void setChiTietHoaDon(ChiTietHoaDon[] ChiTietHoaDon) {
        this.ChiTietHoaDon = ChiTietHoaDon;
    }
    
}
