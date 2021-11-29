package school;

import java.util.ArrayList;
import java.util.List;

public class Student {

    // properties of the student (fields)
    private String name;
    private int ID;
    private List<Course> courses;

    // Constructors
    public Student(){
        this.courses = new ArrayList<Course>();
    }

    public Student(String name, int ID, List<Course> courses){
        this.name = name;
        this.ID = ID;
        this.courses = courses;
    }

    // adding a course
    public void addCourse(Course title){
        courses.add(title);
    }

    // getting and setting fields
    public String getName()
    {
        return name;
    }

    public int getID(){
        return ID;
    }

    public List<Course> getCourses(){ return courses;}

    public void setName(String name){
        this.name = name;
    }

    public void setID(int ID){
        this.ID = ID;
    }

}
