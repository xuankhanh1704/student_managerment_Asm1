import constant.Constant;
    
public class Student {
    private String name;
    private int age;
    private Double gpa;
    private String gender;

    public Student() {}

    public Student(String name, int age , Double gpa , String gender) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Double getGpa() {
        return gpa;
    }
    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
