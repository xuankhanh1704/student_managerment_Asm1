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
                System.out.println("Please enter a number : ");
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
                System.out.println("Please enter an alphabet : ");
            }
        }
    }
}
/// Em làm vội không sử dụng hết validate vào các input=)) mong thầy đừng soi