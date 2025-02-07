package strings;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String s = scanner.nextLine();
        String[] tu = s.trim().split("\\s+");
        int soTu = tu.length;
        System.out.println("so tu trong chuoi la: " + soTu);

    }
}
