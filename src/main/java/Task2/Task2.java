package Task2;

import java.util.Scanner;
public class Task2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int width = sc.nextInt();
        double price = sc.nextInt();

        double area = length * width;
        double totalCost = area * 1.05 * price;

        System.out.println(totalCost);
    }
}