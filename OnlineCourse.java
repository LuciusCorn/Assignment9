package ngominhquang_2442;

import java.util.Date;
import java.util.Scanner;

public class OnlineCourse extends Course {

    private String platformName;
    private double discountPercent;

    Scanner sc = new Scanner(System.in);

    public OnlineCourse() {
    }

    public OnlineCourse(String platformName, double discountPercent, String id, double feePerStudent, Date startDate, boolean isAvailable, int enrrolledStudents) {
        super(id, feePerStudent, startDate, isAvailable, enrrolledStudents);
        this.platformName = platformName;
        this.discountPercent = discountPercent;
    }

    public String getPlatformName() {
        return platformName;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public void addCourse() {
        super.addCourse();
        System.out.print("Enter Platform Name: ");
        setPlatformName(sc.nextLine());
        System.out.print("Enter discount percent: ");
        setDiscountPercent(sc.nextDouble());
        sc.nextLine();
    }

    @Override
    public void updateCourse() {
        super.updateCourse();
        System.out.print("Enter Platform Name: ");
        setPlatformName(sc.nextLine());
        System.out.print("Enter discount percent: ");
        setDiscountPercent(sc.nextDouble());
        sc.nextLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform Name:" + getPlatformName());
        System.out.println("discount percent: " + getDiscountPercent());
        System.out.println("Total fee: " + calculateTotalFee());
    }

    @Override
    public double calculateTotalFee() {
        return getFeePerStudent() * getEnrrolledStudents() * (1 - getDiscountPercent() / 100);
    }
}
