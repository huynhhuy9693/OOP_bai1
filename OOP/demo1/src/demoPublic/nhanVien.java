/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoPublic;

/**
 *
 * @author HUYNH HUY
 */
public class nhanVien extends canBo{
    
    private String congViec ;

    public nhanVien(String congViec, String hoTen, int tuoi, String gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    
    @Override
    public String toString() {
        return "Engineer{" +
                "CONG VIEC  ='" + congViec + '\'' +
                ", HO TEN ='" + hoTen + '\'' +
                ", TUOI =" + tuoi +
                ", GIOI TINH ='" + gioiTinh + '\'' +
                ", DIA CHI ='" + diaChi + '\'' +
                '}';
    }
}
