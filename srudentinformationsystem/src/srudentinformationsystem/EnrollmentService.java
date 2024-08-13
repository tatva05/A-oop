package srudentinformationsystem;

public class EnrollmentService implements Enrollment {

    @Override
    public void enrollStudentInCourse(Student student, Course course) {
        if (student != null && course != null) {
            student.enrollCourse(course.getCourseId());
            course.enrollStudent(student.getId());
            System.out.println("Student " + student.getName() + " enrolled in course " + course.getCourseName());
        } else {
            System.out.println("Enrollment failed. Invalid student or course.");
        }
    }
}
