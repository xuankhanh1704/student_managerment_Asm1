import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continueLoop = true;
        while (continueLoop) {
            System.out.println("1.Thêm sinh viên");
            System.out.println("2.In danh sách sinh viên");
            System.out.println("3.Tìm kiếm sinh viên theo tên : ");
            System.out.println("4.In danh sách sinh viên theo điểm (cao nhat) ");
            System.out.println("5.In danh sách sinh viên theo điểm (thap nhat)");
            System.out.println("6.Cập nhật thông tin sinh viên ");
            System.out.println("7.Xóa sinh viên theo tên");
            System.out.println("8.Thoát");

            int choice;
            choice = Validated.valiDated();
            switch (choice) {
                case 1:
                    StudentManager.addStudent();
                    break;
                case 2:
                    StudentManager.getStudent();
                    break;
                case 3:
                    Scanner input2 = new Scanner(System.in);
                    String name = input2.nextLine();
                    StudentManager.searchStudent(name);
                    break;
                case 4:
                    StudentManager.sortStudentsByGpa();
                    break;
                case 5:
                    StudentManager.bubbleSortByGpaAscending();
                    break;
                case 6:
                    Scanner input4 = new Scanner(System.in);
                    name = input4.nextLine();
                    StudentManager.updateStudentInfo(name);
                    break;
                case 7:
                    Scanner input3 = new Scanner(System.in);
                    String name2 = input3.nextLine();
                    StudentManager.deleteStudent(name2);
                    break;
                case 8:
                    continueLoop = false;
                    break;
                default:
                    System.out.println("--------------------------------------------");
                    System.out.println("Đéo được nha , chỉ được chọn từ 1 đến 8 ! ");
                    System.out.println("--------------------------------------------");
            }
        }
    }
}