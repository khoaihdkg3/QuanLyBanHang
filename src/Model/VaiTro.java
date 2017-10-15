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
public class VaiTro {
    private String ma, ten;
    private Quyen quyen[];
    public VaiTro(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    public String getMa(){
        return ma;
    }
    public String getTen(){
        return ten;
    }

    public Quyen[] getQuyen() {
        return quyen;
    }
    
    public void setMa(String str){
        ma = str;
    }
    public void setTen(String str){
        ten = str;
    }

    public void setQuyen(Quyen[] quyen) {
        this.quyen = quyen;
    }
    
}
