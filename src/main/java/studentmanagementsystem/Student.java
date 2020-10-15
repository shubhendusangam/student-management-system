package studentmanagementsystem;

import java.util.Scanner;

import static java.lang.System.*;

public class Student {

   private String firstName;
   private String lastName;
   private String gradeYear;
   private String studentID;
   private String courses;
   private int tuitionBalance = 0;
   private static int costOfCourse = 600;
   private static int ID = 1000;

   private static final String NEWLINE = "\n";

   // constructor prompt user to enter student's name and Year
   public Student() {
      Scanner scanner = new Scanner(in);
      out.print("Enter First Name: ");
      this.firstName = scanner.nextLine();

      out.print("Enter Last Name: ");
      this.lastName = scanner.nextLine();

      out.print("Enter grade Year (1st to 10th): ");
      this.gradeYear = scanner.nextLine();

      setStudentId();
   }

   // Generate an ID
   private void setStudentId() {
      ID++;
      this.studentID = gradeYear + ID;
   }

   // Enroll in Courses
   public void enroll() {
      int counter = 0;
      while (true) {
         out.println("Enter courses to enroll (Q to exist)");
         Scanner scanner = new Scanner(in);
         String course = scanner.nextLine();
         if (!course.equalsIgnoreCase("Q")) {
            this.courses = (courses != null) ? (courses + NEWLINE + (++counter +")") + course) : (NEWLINE + (++counter +")") + course);
            this.tuitionBalance += costOfCourse;
         } else break;
      }
   }

   // View Balance
   public void viewBalance() {
      out.println("Your Balance is: " + tuitionBalance);
   }

   // Pay Tuition
   public void tuitionPayment() {
      viewBalance();
      out.print("How much want to pay : ");
      Scanner scanner = new Scanner(System.in);
      int payment = scanner.nextInt();
      tuitionBalance -= payment;
      out.println("Thank You for your payment of : " + payment);
      viewBalance();
   }

   // Show Status

   @Override
   public String toString() {
      return "Student's ID is " + studentID + NEWLINE +
            "NAME is " + firstName + " " + lastName + NEWLINE +
            "COURSES Enrolled " + courses + NEWLINE +
            "Balance is " + tuitionBalance;
   }
}
