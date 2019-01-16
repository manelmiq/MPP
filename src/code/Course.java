package code;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String   Number ;
    private String   Title ;
    private int  units ;
    private Faculty faculty;


    public Course(String number, String title, int unit, Person faculty) {
        Number = number;
        Title = title;
        units = unit;
        this.faculty = (Faculty)faculty;
    }
}
