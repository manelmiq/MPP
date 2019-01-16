package code;

public class Student extends Person {
    double gpa;

    public Student(String name, String phone, int age, double gpa){
        super(name, phone, age);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
