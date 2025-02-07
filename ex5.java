package strings;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String s = scanner.nextLine();
        System.out.println("Nhap vao mot ki tu: ");
        char kyTu = scanner.next().charAt(0);
        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == kyTu) {
                dem++;
            }
        }
        System.out.println("So lan ky tu " + kyTu + " xuat hien trong chuoi: " + dem);
    }
}
