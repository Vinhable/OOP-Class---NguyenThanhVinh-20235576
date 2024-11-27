import java.util.Scanner;
public class Bai6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap nam ");
        int year = scanner.nextInt();
        System.out.println("nhap thang");
        int month = scanner.nextInt();
        while(month > 12 || month < 1){
            System.out.println("khong hop le, moi thu lai ");
            month = scanner.nextInt();
        }
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 ngay");
                break;
            case 2: 
                if(year%4 != 0) 
                    System.out.println("28 ngay");
                else 
                    System.out.println("29 ngay");
                break;
            default:
                System.out.println("30 ngay");
                break;
        }
        scanner.close();
    }

}
