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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Nhap so luong nhan su: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        NhanSu[] danhSach = new NhanSu[n];
        

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nhan su thu " + (i + 1) + ":");
            danhSach[i] = new NhanSu();
            danhSach[i].NHAP();
        }
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(danhSach[i].getHoten().compareToIgnoreCase(danhSach[j].getHoten()) > 0) {
                    NhanSu temp = danhSach[i];
                    danhSach[i] = danhSach[j];
                    danhSach[j] = temp;
                }
            }
        }
        System.out.println("\nDanh sach nhan su sau khi sap xep:");
        for (NhanSu ns : danhSach) {
            ns.XUAT();
            System.out.println();
        }
    }
}
