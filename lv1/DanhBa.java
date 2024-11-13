package DanhBa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DanhBa {

    private String name;
    private String phone;
    private String time;

    public DanhBa(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
    
    public DanhBa() {
        
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ten: ");
        name = sc.nextLine();

        System.out.println("nhap so dien thoai: ");
        phone = sc.nextLine();
        time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
    
    public static void tieuDe() {
        String line = String.format("%-20s %-20s %-30s", "HO TEN", "SĐT", "THOI GIAN");
        System.out.println(line);
    }

    public void xuat() {
        String line = String.format("%-20s %-20s %-30s", name, phone, time);
        System.out.println(line);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getTime() {
        return time;
    }
    
    
}
