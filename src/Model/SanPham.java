package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class SanPham {

    private String ma, ten;
    private LoaiSanPham loai;
    private NhaCungCap ncc[];
    private KhuyenMai km[];
    private float DonGiaBan;
    public SanPham(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
    
    public LoaiSanPham getLoaiSanPham() {
        return loai;
    }

    public NhaCungCap[] getNhaCungCap() {
        return ncc;
    }

    public KhuyenMai[] getKhuyenMai() {
        return km;
    }

    public LoaiSanPham getLoai() {
        return loai;
    }

    public float getDonGiaBan() {
        return DonGiaBan;
    }
    
    public void setMa(String str) {
        ma = str;
    }

    public void setTen(String str) {
        ten = str;
    }

    public void setLoaiSanPhan(LoaiSanPham loai) {
        this.loai = loai;
    }

    public void setNhaCungCap(NhaCungCap[] ncc) {
        this.ncc = ncc;
    }

    public void setKhuyenMai(KhuyenMai[] km) {
        this.km = km;
    }

    public void setLoai(LoaiSanPham loai) {
        this.loai = loai;
    }

    public void setDonGiaBan(float DonGiaBan) {
        this.DonGiaBan = DonGiaBan;
    }
    
}
