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
class QuanLy {
    private String maql;
    private String name;
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma quan ly: ");
        maql = sc.nextLine();
        System.out.println("nhap ho va ten: ");
        name = sc.nextLine();
    }
    public void xuat() {
        System.out.println("ma quan ly: " + maql);
        System.out.println("ho va ten: " + name);
    }    
}
