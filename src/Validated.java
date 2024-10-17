import java.util.Scanner;
public class Validated {
    public static int valiDated() {
        Scanner sc = new Scanner(System.in);
        int a;
        while (true) {
            try {
                sc = new Scanner(System.in);
                a = sc.nextInt();
                return a;
            } catch (Exception e) {
                System.out.println("Vui lòng nhập 1 số : ");
            }
        }
    }

    public static String validDated() {
        Scanner sc = new Scanner(System.in);
        String a;
        while (true) {
            try {
                sc = new Scanner(System.in);
                a = sc.next();
                return a;
            }catch (Exception e) {
                System.out.println("Vui lòng nhập 1 trong 3 loại phng A B C");
            }
        }
    }
}