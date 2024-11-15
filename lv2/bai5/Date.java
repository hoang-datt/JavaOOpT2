package Date;

import java.util.Scanner;

public class Date {

    private int ngay;
    private int thang;
    private int nam;

    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        ngay = sc.nextInt();
        System.out.print("Nhap thang: ");
        thang = sc.nextInt();
        System.out.print("Nhap nam: ");
        nam = sc.nextInt();
    }

    public void XUAT() {
        System.out.printf("%02d/%02d/%04d", ngay, thang, nam);
    }
}
