import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Bài so sánh a và b
        Scanner scanner = new Scanner(System.in);

        int a = 0, b = 0;

        System.out.println("Nhap a: ");
        a = scanner.nextInt();

        System.out.println("Nhap b: ");
        b = scanner.nextInt();

        if (a > b) {
            System.out.println("a lon hon b");
        } else if (b > a) {
            System.out.println("b lon hon a");
        }
    }
}