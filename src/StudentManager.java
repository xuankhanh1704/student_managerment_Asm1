import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class StudentManager {
    static ArrayList<Student> students = new ArrayList<>();

    public static void addStudent() {
       while (true) {
           Student student = new Student();
           Scanner input = new Scanner(System.in);
           System.out.println("Input name:");
           student.setName(input.next());
           System.out.println("Input age:");
           student.setAge(input.nextInt());
           System.out.println("Input average score  :");
           student.setGpa(input.nextDouble());
           System.out.println("Input  gender    :");
           student.setGender(input.next());
           input.nextLine();

           students.add(student);

           System.out.println("Break or Continue?  : y/n? ");
           Scanner sc = new Scanner(System.in);
           String answer = sc.next();
           if(answer.equals("n")){
               break;
           }
       }
    }

    public static  ArrayList<Student> getStudent() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Name: "+ students.get(i).getName() + "Age: " + students.get(i).getAge() + "gpa:  " + students.get(i).getGpa() + "Gender: " + students.get(i).getGender());
        }
        return null;

    }

    public  static  ArrayList<Student> searchStudent(String name) {

        System.out.println("Input name :");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                return students;
            }
        }
        return null;
    }
    public static void deleteStudent(String name) {
        System.out.println("Input name:");
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getName().equals(name)){
                students.remove(i);
            }
        }
        boolean studentFound = false;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                studentFound = true;
                // Perform update
            }
        }
        if (!studentFound) {
            System.out.println("Student not found.");
        }
    }

public static void sortStudentsByGpa() {
    int n = students.size();

    for (int i = 0; i < n - 1; i++) {
        // Find the index of the student with the maximum GPA in the unsorted part
        int maxIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (students.get(j).getGpa() > students.get(maxIndex).getGpa()) {
                maxIndex = j;
            }
        }

        if (maxIndex != i) {
            Student temp = students.get(i);
            students.set(i, students.get(maxIndex));
            students.set(maxIndex, temp);
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
