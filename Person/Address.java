package Person;

import java.util.Scanner;

public class Address {

    private String khuVuc;
    private String quan;
    private String thanhPho;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap khu vuc: ");
        khuVuc = sc.nextLine();
        System.out.println("Nhap quan: ");
        quan = sc.nextLine();
        System.out.println("nhap thanh pho: ");
        thanhPho = sc.nextLine();
    }

    public String xuat() {
        return khuVuc + " - " + quan + " - " + thanhPho;
    }

    public Address(String khuVuc, String quan, String thanhPho) {
        this.khuVuc = khuVuc;
        this.quan = quan;
        this.thanhPho = thanhPho;
    }

}
