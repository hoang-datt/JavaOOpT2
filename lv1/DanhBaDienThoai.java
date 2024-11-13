package DanhBa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DanhBaDienThoai {

    private static Scanner sc = new Scanner(System.in);
    private static DanhBa[] lienHe = new DanhBa[1000];
    private static int count = 0;

    public static void them() {
        if (count >= 1000) {
            System.out.println("danh ba da day.");
            return;
        }
        DanhBa danhBaMoi = new DanhBa();
        danhBaMoi.nhap();
        lienHe[count++] = danhBaMoi;
        System.out.println("lien he da duoc them.");
    }

    public static void xoa() {
        if (count == 0) {
            System.out.println("danh ba trong.");
            return;
        }
        
        System.out.println("danh sach lien he:");
        System.out.printf("%-20s %-20s %-30s", "ten", "so dien thoai", "thoi gian tao");
        System.out.println("");

        for (int i = 0; i < count; i++) {
            lienHe[i].xuat();
        }

    }

    public static void timKiem(String tim) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (lienHe[i].getName().equalsIgnoreCase(tim) || lienHe[i].getPhone().equals(tim)) {
                System.out.println("thong tin lien he tim thay: ");
                lienHe[i].xuat();
                found = true;
            }
        }
        if (!found) {
            System.out.println("khong tim thay lien he.");
        }
    }

    public static void sapXepTheoTen() {
        Arrays.sort(lienHe, 0, count, Comparator.comparing(DanhBa::getName));
        System.out.println("danh ba lien he sap xep theo ten:");
        xoa();
    }

    public static void danhSachLienHeTheoThoiGian() {
        Arrays.sort(lienHe, 0, count, Comparator.comparing(DanhBa::getTime));
        System.out.println("danh sach lien he sap xep theo thoi gian tao:");
        xoa();
    }
}
