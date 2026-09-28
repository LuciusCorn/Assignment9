package ngominhquang_2442;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        CourseArrayList courseList = new CourseArrayList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n ===============MENU=============");
            System.out.println("1- Add an online course or offline course");
            System.out.println("2- Update a course by id");
            System.out.println("3- Delete a course by id");
            System.out.println("4- display all courses");
            System.out.println("5- Display courses open for enrollment");
            System.out.println("6- Calculate and display the total fees for all courses");
            System.out.println("0- Exit the program");
            System.out.print("Choose: ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.print("Enter 1- add online course|2- add offline course");
                    int choice = sc.nextInt();
                    if (choice == 1) {
                        OnlineCourse oc = new OnlineCourse();
                        oc.addCourse();
                        courseList.addCourseToArrayList(oc);
                    } else if (choice == 2) {
                        OfflineCourse offlineCourse = new OfflineCourse();
                        offlineCourse.addCourse();
                        courseList.addCourseToArrayList(offlineCourse);
                    }
                    break;
                case 2:
                    System.out.print("Enter id to update: ");
                    String idUp = sc.nextLine();
                    courseList.updateCourseById(idUp);
                    break;
                case 3:
                    System.out.print("Enter id to delete: ");
                    String idDel = sc.nextLine();
                    courseList.deleteCourseById(idDel);
                    break;
                case 4:
                    System.out.println("Display all: ");
                    courseList.displayAllCourses();
                    break;
                case 5:
                    System.out.println("Display courses open for enrollment: ");
                    courseList.displayAvailableCourses();
                    break;
                case 6:
                    System.out.println("Calculate and display the total fees for all courses: " + courseList.calculateTotalFees());
                    break;
                case 0:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
