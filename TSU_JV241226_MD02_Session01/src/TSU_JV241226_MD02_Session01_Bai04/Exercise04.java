package Ex4;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        a = sc.nextInt();
        System.out.print("Nhập số b: ");
        b = sc.nextInt();

        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.printf("a = %d và b = %d%n", a, b);
        System.out.printf("Tổng 2 số a + b = %d%n", sum);
        System.out.printf("Hiệu 2 số a - b = %d%n", diff);
        System.out.printf("Tích 2 số a * b = %d%n", prod);
        System.out.printf("Thương 2 số a / b = %d%n", quotient);
        System.out.printf("Số dư khi chia số a cho b = %d%n", remainder);

    }
}
