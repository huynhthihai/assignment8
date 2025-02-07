package strings;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String s = scanner.nextLine();
        System.out.println("Nhap tu can thay the: ");
        String tuCanThayThe = scanner.nextLine();
        System.out.println("Nhap tu thay the: ");
        String tuThayThe = scanner.nextLine();
        String sNew = s.replace(tuCanThayThe, tuThayThe);
        System.out.println("Chuoi sau khi thay doi: " + sNew);
    }
}
