package ngominhquang_2442;

import java.util.ArrayList;

public class CourseArrayList {

    private ArrayList<Course> courses = new ArrayList<>();

    public void addCourseToArrayList(Course course) {
        courses.add(course);
    }

    public void updateCourseById(String id) {
        for (Course course : courses) {
            if (course.getId().equals(id)) {
                course.updateCourse();
                return;
            }
        }
        System.out.println("Not found message!");
    }

    public void deleteCourseById(String id) {
        for (Course course : courses) {
            if (course.getId().equals(id)) {
                courses.remove(course);
                return;
            }
        }
        System.out.println("Not found message!");
    }

    public void displayAllCourses() {
        for (Course course : courses) {
            course.displayDetails();
        }
    }

    public void displayAvailableCourses() {
        for (Course course : courses) {
            if (course.isIsAvailable() == true) {
                course.displayDetails();
            }
        }
    }

    public double calculateTotalFees() {
        double sum = 0;
        if (courses.isEmpty()) {
            return 0;
        }
        for (Course course : courses) {
            sum += course.calculateTotalFee();
        }
        return sum;
    }
}
