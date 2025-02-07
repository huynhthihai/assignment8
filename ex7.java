package strings;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String s = scanner.nextLine();
        System.out.println("Cac so trich xuat tu chuoi: ");
        String number = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                number += ch;

            } else {
                if (!number.equals("")) {
                    System.out.println(number + " ");
                    number = "";

                }

            }
        }
        if (!number.equals("")) {
            System.out.println(number);
        }
    }
}
