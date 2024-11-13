package Person;

import java.util.Scanner;

public class Person {

    private String name;
    private int age;
    private Address address;

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ten: ");
        name = sc.nextLine();

        System.out.println("nhap tuoi: ");
        age = sc.nextInt();

        System.out.println("nhap dia chi: ");
        address = new Address("String name", "int age", "Address address");
        address.nhap();
    }

    public static void tieuDe() {
        String line = String.format("%-20s %-20s %-30s", "HO TEN", "TUOI", "DIA CHI");
        System.out.println(line);
    }

    public void xuat() {
        String line = String.format("%-20s %-20s %-30s", name, age, address.xuat());
        System.out.println(line);
    }
    
    public Person() {
        
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
}
