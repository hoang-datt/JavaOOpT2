/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhongMay;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
class May {
    private String maMay;
    private String kieuMay;
    private String tinhTrang;
    

    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma may:");
        maMay = sc.nextLine();
        System.out.println("nhap kieu may:");
        kieuMay = sc.nextLine();
        System.out.println("nhap tinh trang may:");
        tinhTrang = sc.nextLine();
    }
    
    public void xuat() {
        System.out.println("ma may vua nhap: " + maMay);
        System.out.println("kieu may vua nhap: " + kieuMay);
        System.out.println("tinh trang may vua nhap: " + tinhTrang);
    }    
}
