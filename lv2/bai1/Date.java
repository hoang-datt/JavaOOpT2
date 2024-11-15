
package HangHoa;

import java.util.Scanner;

public class Date {
    private int D;
    private int M;
    private int Y;
    
    public Date() {
        D = 0;
        M = 0;
        Y = 0;
    }
    
    public Date(int D, int M, int Y) {
        this.D = D;
        this.M = M;
        this.Y = Y;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap ngay: ");
        D = sc.nextInt();
        
        System.out.print("nhap thang: ");
        M = sc.nextInt();
        
        System.out.print("nhap nam: ");
        Y = sc.nextInt();
    }
    
    public void xuat() {
        System.out.println("ngay sinh: " + D + "/" + M + "/" + Y);
    }
}
