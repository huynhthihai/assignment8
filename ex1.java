package strings;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String s = scanner.nextLine();
        int soKytu = s.length();
        System.out.println("So ki tu trong chuoi la: " + soKytu);
    }

}
