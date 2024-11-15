
package HangTrongPhieu;

import java.util.Scanner;


public class HangHoa {
    private String maPhieu;
    private Hang[] hang;
    private int x;
    
    public HangHoa() {
        
    }

    public HangHoa(String maPhieu, Hang[] hang, int x) {
        this.maPhieu = maPhieu;
        this.hang = hang;
        this.x = x;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma phieu: ");
        maPhieu = sc.nextLine();
        System.out.print("nhap so luong mat hang:");
        x = sc.nextInt();
        
        hang = new Hang[x];
        for(int i = 0; i < x; i++) {
            System.out.println("nhap thong tin mat hang thu " + (i + 1) + ":");
            hang[i] = new Hang();
            hang[i].nhap();
        }
        sc.nextLine();
    }
    
    public void xuat() {
        System.out.println("ma phieu: " + maPhieu);
        System.out.println("danh sach mat hang:" );
        for(int i = 0; i < x; i++) {
            System.out.println("mat hang thu " + (i + 1) + ":");
            hang[i].xuat();
        }
    }
}
