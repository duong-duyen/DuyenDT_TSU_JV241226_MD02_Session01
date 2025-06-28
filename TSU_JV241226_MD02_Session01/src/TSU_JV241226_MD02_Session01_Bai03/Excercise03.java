package Ex3;

import java.util.Scanner;

public class Excercise03 {
    public static void main(String[] args) {
        // Khai báo
        double radius;
        double area;

        // Khởi tạo nhận dữ liệu
        Scanner sc = new Scanner(System.in);

        // Cho ng dùng nhập vào bán kính
        System.out.println("Enter the radius of the circle: ");


        // Lưu vào biến radius
        radius = sc.nextDouble();

        // Công thức tính diện tích hình tròn
        area = Math.PI * radius * radius;

        // In ra màn hình
        System.out.println("The area of the circle is " + area);
    }
}
