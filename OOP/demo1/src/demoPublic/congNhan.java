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
public class congNhan extends canBo{
    private  int bac;

    public congNhan(int bac, String hoTen, int tuoi, String gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        if(bac<1 || bac >10)
        {
            System.out.println("fail");
        }else
            this.bac =bac;
    }
    @Override
    public String toString() {
        return "Engineer{" +
                "CAP BAC ='" + bac + '\'' +
                ", HO TEN ='" + hoTen + '\'' +
                ", TUOI =" + tuoi +
                ", GIOI TINH ='" + gioiTinh + '\'' +
                ", DIA CHI ='" + diaChi + '\'' +
                '}';
    }
}
