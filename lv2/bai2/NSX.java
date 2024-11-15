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
public class NSX {
    private String maNSX;
    private String tenNSX;
    private String diaChiSX;
    
    public NSX() {
        
    }

    public NSX(String maNSX, String tenNSX, String diaChiSX) {
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
        this.diaChiSX = diaChiSX;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhap ma ngay san xuat: ");
        maNSX = sc.nextLine();
        
        sc.nextLine();
        
        System.out.println("nhap ten ngay san xuat: ");
        tenNSX = sc.nextLine();
        
        System.out.println("nhap dia chi san xuat: ");
        diaChiSX = sc.nextLine();
    }
    
    public void xuat() {
        System.out.println("ma ngay san xuat: " + maNSX);
        System.out.println("ten ngay san xuat: " + tenNSX);
        System.out.println("dia chi san xuat: " + diaChiSX);
    }
}
