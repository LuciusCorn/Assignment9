package ngominhquang_2442;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Course implements ICourse {

    private String id;
    private double feePerStudent;
    private Date startDate;
    private boolean isAvailable;
    private int enrrolledStudents;

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Course() {
    }

    public Course(String id, double feePerStudent, Date startDate, boolean isAvailable, int enrrolledStudents) {
        this.id = id;
        this.feePerStudent = feePerStudent;
        this.startDate = startDate;
        this.isAvailable = isAvailable;
        this.enrrolledStudents = enrrolledStudents;
    }

    public String getId() {
        return id;
    }

    public double getFeePerStudent() {
        return feePerStudent;
    }

    public Date getStartDate() {
        return startDate;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public int getEnrrolledStudents() {
        return enrrolledStudents;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFeePerStudent(double feePerStudent) {
        this.feePerStudent = feePerStudent;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setEnrrolledStudents(int enrrolledStudents) {
        this.enrrolledStudents = enrrolledStudents;
    }

    @Override
    public void addCourse() {
        System.out.print("Enter id:");
        setId(sc.nextLine());
        System.out.print("Enter fee per student: ");
        setFeePerStudent(sc.nextDouble());
        sc.nextLine();
        System.out.print("Enter start date(dd/MM/yyyy)");
        String dateString = sc.nextLine();
        try {
            setStartDate(sdf.parse(dateString));
        } catch (ParseException ex) {
            System.out.println("Invalid date!");
        }
        System.out.print("Enter is available (True/false): ");
        setIsAvailable(sc.nextBoolean());
        System.out.print("Enter enrroled students: ");
        setEnrrolledStudents(sc.nextInt());
    }

    @Override

    public void updateCourse() {
        System.out.print("Enter fee per srudent: ");
        setFeePerStudent(sc.nextDouble());
        sc.nextLine();
        System.out.print("Enter start date(dd/MM/yyyy)");
        String dateString = sc.nextLine();
        try {
            setStartDate(sdf.parse(dateString));
        } catch (ParseException ex) {
            System.out.println("Invalid date!");
        }
        System.out.print("Enter is available (True/false): ");
        setIsAvailable(sc.nextBoolean());
        System.out.print("Enter enrroled students: ");
        setEnrrolledStudents(sc.nextInt());
    }

    @Override
    public void displayDetails() {
        System.out.println("Id: " + getId());
        System.out.println("Fee per student:" + getFeePerStudent());
        System.out.println("Start date: " + sdf.format(startDate));
        System.out.println("Is available: " + isIsAvailable());
        System.out.println("Enrroled students: " + getEnrrolledStudents());
    }

}
