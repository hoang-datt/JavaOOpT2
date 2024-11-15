
package HangHoa;

import java.util.Scanner;


public class NhanSu {
    private String maNhanSu;
    private String name;
    private Date ngaySinh;
    
    public NhanSu() {
        maNhanSu = "";
        name = "";
        ngaySinh = new Date();
    }
    
    public NhanSu(String maNhanSu, String name, Date ngaySinh) {
        this.maNhanSu = maNhanSu;
        this.name = name;
        this.ngaySinh = ngaySinh;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap ma nhan su:");
        maNhanSu = sc.nextLine();
        
        System.out.print("nhap ho va ten nhan su:");
        name = sc.nextLine();
        ngaySinh.nhap();
    }
    
    public void xuat() {
        System.out.println("ma nhan su: " + maNhanSu);
        System.out.println("ho va ten: " + name);
        ngaySinh.xuat();
    }
}
