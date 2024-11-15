/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Date;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class NhanSu {
    private String hoten;
    private Date ngaysinh;
    private String socmt;

    public NhanSu() {
        ngaysinh = new Date();
    }

    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        ngaysinh.NHAP();
        System.out.print("Nhap so CMT: ");
        socmt = sc.next();
    }

    public void XUAT() {
        System.out.println("Ho ten: " + hoten);
        System.out.print("Ngay sinh: ");
        ngaysinh.XUAT();
        System.out.println("\nSo CMT: " + socmt);
    }

    public String getHoten() {
        return hoten;
    }
}
