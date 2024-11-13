package Person;

import java.util.Scanner;

public class MainPerson {

    public static Scanner sc = new Scanner(System.in);
    public static int count = 0;
    public static Person[] list_persons = new Person[100];

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("===MENU===");
            System.out.println("99. khoi tao du lieu");
            System.out.println("1. them Person");
            System.out.println("2. xuat danh sach Person");
            System.out.println("3. sap xep danh sach Person co tuoi giam dan");
            System.out.println("4. sap xep danh sach Person co tuoi tang dan");
            System.out.println("5. hien thi danh sach Person co ten chua chu Hoang");
            System.out.println("6. hien thi danh sach Person o quan thot not");
            System.out.println("7. sap xep danh sach Person tang dan theo ten");
            System.out.println("8. hien thi Person co tuoi cao nhat");
            System.out.println("0. thoat");
            System.out.println("nhap lua chon");
            choice = sc.nextInt();

            switch (choice) {
                case 99:
                    initData();
                    break;
                case 1:
                    list_persons[count] = new Person();
                    list_persons[count].nhap();
                    break;
                case 2:
                    xuatDS(list_persons);
                    break;
                case 3:
                    for (int i = 0; i < count - 1; i++) {
                        for (int j = i + 1; j < count; j++) {
                            if (list_persons[i].getAge() < list_persons[j].getAge()) {
                                Person tam = list_persons[i];
                                list_persons[i] = list_persons[j];
                                list_persons[j] = tam;
                            }
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < count - 1; i++) {
                        for (int j = i + 1; j < count; j++) {
                            if (list_persons[i].getAge() > list_persons[j].getAge()) {
                                Person tam = list_persons[i];
                                list_persons[i] = list_persons[j];
                                list_persons[j] = tam;
                            }
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < count; i++) {
                        if (list_persons[i].getName().toUpperCase().contains("hoang")) {
                            System.out.println(list_persons[i]);
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < count; i++) {
                        if (list_persons[i].getAddress().toString().contains("thot not")) {
                            System.out.println(list_persons[i]);
                        }
                    }
                    break;
                case 7:
                    for (int i = 0; i < count - 1; i++) {
                        for (int j = i + 1; j < count; j++) {
                            if (list_persons[i].getName().compareToIgnoreCase(list_persons[j].getName()) > 0);
                            Person tam = list_persons[i];
                            list_persons[i] = list_persons[j];
                            list_persons[j] = tam;
                        }
                    }
                    break;
                case 8:
                    if(count > 0) {
                        Person lonTuoi = list_persons[0];
                        for(int i = 0; i < count; i++) {
                            if(list_persons[i].getAge() > lonTuoi.getAge()) {
                                lonTuoi = list_persons[i];
                            }
                        }
                        System.out.println("Person co tuoi lon nhat: " + lonTuoi);
                    }else {
                        System.out.println("danh sach rong.");
                    }
                    break;
                case 0:
                    System.out.println("Tam Biet!!!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 0);
        {

        }
    }

    private static void xuatDS(Person[] a) {
        Person.tieuDe();
        for (int i = 0; i < count; i++) {
            a[i].xuat();
        }
    }

    private static void initData() {
        Address a = new Address("long thanh a", "thot not", "can tho");
        Person person1 = new Person("Hoang Nam", 22, a);

        list_persons[count] = person1;
        count++;

        Address a2 = new Address("long thanh a", "thot not", "can tho");
        Person person2 = new Person("Phuong Lan", 25, a2);
        list_persons[count] = person2;
        count++;

        Address a3 = new Address("long thanh a", "trung nhut", "can tho");
        Person person3 = new Person("Hoang Minh", 30, a3);
        list_persons[count] = person3;
        count++;

        Address a4 = new Address("long thanh 2", "thoi thuan", "can tho");
        Person person4 = new Person("Thanh Huong", 27, a4);
        list_persons[count] = person4;
        count++;

        Address a5 = new Address("long thanh 2", "trung kien", "can tho");
        Person person5 = new Person("Minh Khoa", 35, a5);
        list_persons[count] = person5;
        count++;

        Address a6 = new Address("long thanh 1", "thot not", "can tho");
        Person person6 = new Person("Hoang Phong", 28, a6);
        list_persons[count] = person6;
        count++;
    }

}
