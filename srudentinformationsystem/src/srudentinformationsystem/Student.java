package srudentinformationsystem;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String id;
    private List<String> enrolledCourses;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollCourse(String courseId) {
        enrolledCourses.add(courseId);
    }
}
