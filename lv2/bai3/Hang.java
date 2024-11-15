
package HangTrongPhieu;

import java.util.Scanner;


class Hang {
    private String maHang;
    private String tenHang;
    private String donGia;
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma hang:");
        maHang = sc.nextLine();
        System.out.print("nhap ten hang:");
        tenHang = sc.nextLine();
        System.out.print("nhap don gia:");
        donGia = sc.nextLine();
    }
    
    public void xuat() {
        System.out.println("ma hang: " + maHang);
        System.out.println("ten hang: " + tenHang);
        System.out.println("don gia:" + donGia);
    }
}
