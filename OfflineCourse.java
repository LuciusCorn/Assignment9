package ngominhquang_2442;

import java.util.Date;
import java.util.Scanner;

public class OfflineCourse extends Course {

    private String classroomNumber;
    private double materialFeePerStudent;

    Scanner sc = new Scanner(System.in);

    public OfflineCourse() {
    }

    public OfflineCourse(String classroomNumber, double materialFeePerStudent, String id, double feePerStudent, Date startDate, boolean isAvailable, int enrrolledStudents) {
        super(id, feePerStudent, startDate, isAvailable, enrrolledStudents);
        this.classroomNumber = classroomNumber;
        this.materialFeePerStudent = materialFeePerStudent;
    }

    public String getClassroomNumber() {
        return classroomNumber;
    }

    public double getMaterialFeePerStudent() {
        return materialFeePerStudent;
    }

    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public void setMaterialFeePerStudent(double materialFeePerStudent) {
        this.materialFeePerStudent = materialFeePerStudent;
    }

    @Override
    public void addCourse() {
        super.addCourse();
        System.out.print("Enter Classroom Number");
        setClassroomNumber(sc.nextLine());
        System.out.print("Enter Material Fee Per Student: ");
        setMaterialFeePerStudent(sc.nextDouble());
        sc.nextLine();
    }

    @Override
    public void updateCourse() {
        super.updateCourse();
        System.out.print("Enter Classroom Number");
        setClassroomNumber(sc.nextLine());
        System.out.print("Enter Material Fee Per Student: ");
        setMaterialFeePerStudent(sc.nextDouble());
        sc.nextLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Classroom Number: " + getClassroomNumber());
        System.out.println("Material Fee Per Student: " + getMaterialFeePerStudent());
        System.out.println("Total fee: " + calculateTotalFee());
    }

    @Override
    public double calculateTotalFee() {
        return (getFeePerStudent() + getMaterialFeePerStudent()) * getEnrrolledStudents();
    }
}
