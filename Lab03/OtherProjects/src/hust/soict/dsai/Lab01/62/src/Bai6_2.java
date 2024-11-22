import java.util.Scanner;
public class Bai6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May ten la gi? ");
        String name = scanner.nextLine();
        System.out.println("May bao nhieu tuoi? ");
        int age = scanner.nextInt();
        System.out.println("Toi la " + name + ", toi nam nay " + age + " tuoi.");
        scanner.close();
        
    }
    
}
