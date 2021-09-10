/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoPublic;

import java.util.Scanner;



public class Main{   
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        quanLyCanBo ql = new quanLyCanBo();
        while(true)
         {
        System.out.println("HE THONG QUAN LY CAN BO");
        System.out.println("1. THEM MOI CAN BO");
        System.out.println("2.TIM KIEM THEO HO TEN");
        System.out.println("3.HIEN THI DANH SACH CAN BO");
        System.out.println("4.THOAT CHUONG TRINH");
        System.out.print("MOI BAN CHON : ");
        String chon; 
        chon = sc.nextLine();
        switch (chon) 
            {
                case "1":{
                    System.out.println("1.THEM MOI KY SU");
                    System.out.println("2.THEM MOI NHAN VIEN");
                    System.out.println("3.THEM MOI CONG NHAN");
                    System.out.print("MOI BAN CHON : ");
                    String chonNghe;
                    chonNghe = sc.nextLine();
                    switch (chonNghe)
                    {
                        case "1": {
                            System.out.print("NHAP TEN :");
                            String hoTen = sc.nextLine();
                            System.out.print("NHAP TUOI :");
                            int tuoi = sc.nextInt();
                            sc.nextLine();
                            System.out.print("NHAP GIOI TINH :");
                            String gioiTinh = sc.nextLine();
                            System.out.print("NHAP DIA CHI :");
                            String diaChi = sc.nextLine();
                            System.out.print("NHAP NGANH DAO TAO :");
                            String nganh = sc.nextLine();
                            canBo kysu = new kySu(nganh, hoTen, tuoi, gioiTinh, diaChi);
                            ql.themCanBo(kysu);
                            System.out.print("THEM THANH CONG!!!!");
                            System.out.print(kysu.toString());             
                            break;
                        }
                        case "2":
                        {
                            System.out.print("NHAP TEN :");
                            String hoTen = sc.nextLine();
                            System.out.print("NHAP TUOI :");
                            int tuoi = sc.nextInt();
                            sc.nextLine();
                            System.out.print("NHAP GIOI TINH :");
                            String gioiTinh = sc.nextLine();
                            System.out.print("NHAP DIA CHI :");
                            String diaChi = sc.nextLine();
                            System.out.print("NHAP CONG VIEC :");
                            String congviec = sc.nextLine();
                            canBo nhanvien = new nhanVien(congviec, hoTen, tuoi, gioiTinh, diaChi);
                            ql.themCanBo(nhanvien);
                            System.out.print("THEM THANH CONG");
                            System.out.println("");
                            System.out.print(nhanvien.toString());
                            break;
                        }
                        case "3":
                        {
                            System.out.print("NHAP TEN :");
                            String hoTen = sc.nextLine();
                            System.out.print("NHAP TUOI :");
                            int tuoi = sc.nextInt();
                            sc.nextLine();
                            System.out.print("NHAP GIOI TINH :");
                            String gioiTinh = sc.nextLine();
                            System.out.print("NHAP DIA CHI :");
                            String diaChi = sc.nextLine();
                            System.out.print("NHAP CONG VIEC :");
                            int bac = sc.nextInt();
                            canBo congnhan = new congNhan(bac, hoTen, tuoi, gioiTinh, diaChi);
                            ql.themCanBo(congnhan);
                            System.out.print("THEM THANH CONG!!!");
                            System.out.print(congnhan.toString());
                            break;
                        }
                    }
                    break;                   
                }
                case "2":
                {
                    System.out.println("NHAP HO TEN CAN TIM KIEM!!!");
                    String ten = sc.nextLine();
                    ql.timCanBo(ten).forEach(o->o.toString());    
                    break;
                }
                case "3":
                {
                    System.out.println("DANH SACH CAC CAN BO!!!");
                    ql.xemCanBo();
                    break;
                }
                case "4":
                {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;

                
                
            }
         }
        
    }
}


    