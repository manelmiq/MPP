package code;

import java.util.ArrayList;
import java.util.List;


public class Faculty  extends  Person{
	double salary;

	List<Course> courseList;

    public Faculty(String name, String phone, int age, double salary){
        super(name, phone, age);
        this.salary = salary;
        courseList = new ArrayList<>();
    }
    public double getSalary(){
        return  salary;
    }

}
