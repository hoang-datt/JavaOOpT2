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
public class PhongMay {
    private String ma;
    private String ten;
    private Double dienTich;
    private QuanLy x;
    private May[] y;
    private int n;
    
    /**
     *
     */
    public PhongMay() {  
        x = new QuanLy();
    }

    public PhongMay(String ma, String ten, Double dienTich, QuanLy x, May[] y, int n) {
        this.ma = ma;
        this.ten = ten;
        this.dienTich = dienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }
    
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhap ma phong: ");
        ma = sc.nextLine();
        
        System.out.println("nhap ten phong: ");
        ten = sc.nextLine();
        
        System.out.println("nhap dien tich");
        dienTich = sc.nextDouble();
        
        System.out.println("nhap thong tin quan ly:");
        x = new QuanLy();
        x.nhap();
        
        System.out.println("nhap so may:");
        n = sc.nextInt();
        sc.nextLine();
        y = new May[n];
        for(int i = 0; i < n; i++) {
            System.out.println("nhap thong tin may " + (i + 1) + ":");
            y[i] = new May();
            y[i].nhap();
        }
        
    }
    
    public void xuat() {
        System.out.println("ma phong vua nhap: " + ma);
        System.out.println("ten phong vua nhap: " + ten);
        System.out.println("dien tich phong: " + dienTich);
        System.out.println("nhap thong tin quan ly");
        x.xuat();
        System.out.println("thong tin may:");
        for(int i = 0; i < n; i++) {
            y[i].xuat();
        }
    }
}
