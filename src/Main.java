import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continueLoop = true;
        while (continueLoop) {
            System.out.println("1.Add Student");
            System.out.println("2.Print All Students");
            System.out.println("3.Find Student by Name : ");
            System.out.println("4.Print All Students by GPA(highest) : ");
            System.out.println("5.Print All Students by GPA(highest) (lowest)");
            System.out.println("6.Update Student Infor ");
            System.out.println("7.Delete Student by Name : ");
            System.out.println("8.Exit Program");

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
                    System.out.println("No , just 1 to 8! ");
                    System.out.println("--------------------------------------------");
            }
        }
    }
}
