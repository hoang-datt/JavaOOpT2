/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HangHoa;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class HangHoa {
    private int maHang;
    private String tenHang;
    private NSX x;
    
    public HangHoa() {
    }

    public HangHoa(int maHang, String tenHang, NSX x) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.x = x;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhap ma hang:");
        maHang = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("nhap ten hang: ");
        tenHang = sc.nextLine();
        x = new NSX();
        x.nhap();
    }
    
    public void xuat() {
        System.out.println("ma hang hoa: " + maHang);
        System.out.println("nhap ten hang: " + tenHang);
        x.xuat();
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public NSX getX() {
        return x;
    }

    public void setX(NSX x) {
        this.x = x;
    }
}
