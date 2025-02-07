package strings;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String s = scanner.nextLine();
        String chuoiDaoNguoc = new StringBuilder(s).reverse().toString();
        System.out.println("Chuoi dao nguoc la: " + chuoiDaoNguoc);
    }
}
