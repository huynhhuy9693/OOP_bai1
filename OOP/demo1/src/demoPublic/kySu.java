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
public class kySu extends canBo{
    
    private String nganhDaoTao ;

    public kySu(String nganhDaoTao, String hoTen, int tuoi, String gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
    
     @Override
    public String toString() {
        return "Engineer{" +
                "NGANH DAO TAO ='" + nganhDaoTao + '\'' +
                ", HO TEN ='" + hoTen + '\'' +
                ", TUOI =" + tuoi +
                ", GIOI TINH ='" + gioiTinh + '\'' +
                ", DIA CHI ='" + diaChi + '\'' +
                '}';
    }

}
