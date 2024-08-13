package srudentinformationsystem;

public class StudentInformationSystem {

    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        // Create courses
        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Physics");

        // Enrollment service
        EnrollmentService enrollmentService = new EnrollmentService();

        // Enroll students in courses
        enrollmentService.enrollStudentInCourse(student1, course1);
        enrollmentService.enrollStudentInCourse(student1, course2);
        enrollmentService.enrollStudentInCourse(student2, course1);

        // Print enrolled courses for each student
        System.out.println("Student " + student1.getName() + " is enrolled in: " + student1.getEnrolledCourses());
        System.out.println("Student " + student2.getName() + " is enrolled in: " + student2.getEnrolledCourses());

        // Print enrolled students for each course
        System.out.println("Course " + course1.getCourseName() + " has students: " + course1.getEnrolledStudents());
        System.out.println("Course " + course2.getCourseName() + " has students: " + course2.getEnrolledStudents());
    }
}

