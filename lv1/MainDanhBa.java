package DanhBa;

import java.util.Scanner;

public class MainDanhBa {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhBaDienThoai danhBaDT = new DanhBaDienThoai();
        int choice;

        do {
            System.out.println("\n chon chuc nang: ");
            System.out.println("1. them lien he moi");
            System.out.println("2. hien thi danh sach lien he");
            System.out.println("3. tim kiem lien he");
            System.out.println("4. sap xep danh ba theo ten");
            System.out.println("5. sao xep danh ba theo thoi gian tao");
            System.out.println("0. thoat");


            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    DanhBaDienThoai.them();
                    break;
                case 2:
                    DanhBaDienThoai.xoa();
                    break;
                case 3:
                    System.out.println("nhap so dien thoai de tim kiem: ");
                    String tim = sc.nextLine();
                    DanhBaDienThoai.timKiem(tim);
                    break;
                case 4:
                    DanhBaDienThoai.sapXepTheoTen();
                    break;
                case 5:
                    DanhBaDienThoai.danhSachLienHeTheoThoiGian();
                    break;
                case 0:
                    System.out.println("Tam Biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 0);
    }  
}
