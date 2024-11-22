import java.util.Arrays;
import java.util.Scanner;

public class Bai6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to (1) tu nhap array or (2) su dung array co san? (Enter 1 or 2): ");
        int choice = scanner.nextInt();

        double[] array;

        if (choice == 1) {
            System.out.print("Dien size cua array: ");
            int size = scanner.nextInt();
            array = new double[size];

            System.out.println("Dien " + size + " so:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextDouble();
            }

        } else {
            array = new double[]{1789, 2035, 1899, 1456, 2013};
            System.out.println("Su dung array co san: " + Arrays.toString(array));
        }

        Arrays.sort(array);

        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / array.length;

        System.out.println("Array da loc: " + Arrays.toString(array));
        System.out.println("Tong la: " + sum);
        System.out.println("Trung binh cong la: " + average);

        scanner.close();
    }
}
