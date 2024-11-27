import java.util.Scanner;
public class 226 {
    public static void main(String[] args) {
        float nghiem;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac 2");
        System.out.println("Nhap vao he so a");
        int a = scanner.nextInt();
        System.out.println("Nhap vao so b");
        int b = scanner.nextInt();
        System.out.println("Nhap vao he so c");
        int c =scanner.nextInt();
        if (a==0){
            
            if(b==0 && c==0){
                System.out.println("Phuong trinh vo so nghiem");
            }
            else if(b==0 && c!=0){
                System.out.println("Phuong trinh vo nghiem");
            }
            else {
                float x = (float)-c/b;
                System.out.println("Phuong trinh co nghiem la " + x );
            }
            scanner.close();
        }
        else {
            float delta = (float) Math.pow(b, 2) - 4*a*c;
            if (delta<0){
                System.out.println("{Phuong trinh vo nghiem}");
            }
            else if (delta == 0){
                nghiem = (float) -b/2*a;
                System.out.println("Phuong trinh co nghiem kep la " + nghiem);
            }
            else {
                nghiem = (float) (-b-Math.sqrt(delta))/2/a;
                System.out.println("Nghiem thu nhat la " + nghiem);
                nghiem = (float) (-b+Math.sqrt(delta))/2/a;
                System.out.println("Nghiem thu hai la " + nghiem);
            }
        }
        scanner.close();
    }
}

