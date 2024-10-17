import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class StudentManager {
    static ArrayList<Student> students = new ArrayList<>();

    public static void addStudent() {
       while (true) {
           Student student = new Student();
           Scanner input = new Scanner(System.in);
           System.out.println("Nhap ten:");
           student.setName(input.next());
           System.out.println("Nhap tuoi:");
           student.setAge(input.nextInt());
           System.out.println("Nhap diem trung binh:");
           student.setGpa(input.nextDouble());
           System.out.println("Nhap gioi tinh:");
           student.setGender(input.nextLine());

           students.add(student);
       }
    }

    public static ArrayList<Student> getStudent() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        return students;
    }

    public  static  ArrayList<Student> searchStudent(String name) {

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                return students;
            }
        }
        return null;
    }
    public static void deleteStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getName().equals(name)){
                students.remove(i);
            }
        }
    }
//    public static void sortStudentsByGpa() {
//        for (int i = 0; i < students.size(); i++) {
//            students.sort(Comparator.comparingDouble(Student::getGpa).reversed());
//            System.out.println(students);
//        }
//    }
    public static void sortStudentsByGpa() {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students.get(j).getGpa() < students.get(j + 1).getGpa()) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }
    public static void bubbleSortByGpaAscending() {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students.get(j).getGpa() > students.get(j + 1).getGpa()) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }
    public static void updateStudentInfo(String name){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getName().equals(name)){
                Scanner input = new Scanner(System.in);
                students.get(i).setName(input.nextLine());
                students.get(i).setAge(input.nextInt());
                students.get(i).setGender(input.nextLine());
                students.get(i).setGpa(input.nextDouble());
            }
        }
    }
}
