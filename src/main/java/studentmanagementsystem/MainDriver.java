package studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainDriver {

   public static void main(String[] args) {
      Student student;
      List<Student> enrolledStudent = new ArrayList<Student>();

      // Ask how many new Students we want to add
      System.out.print("Number of students to Enroll ");
      Scanner sc = new Scanner(System.in);
      int numberOfStudentsEnroll = sc.nextInt();

      // Create n number of new Student
      for (int i = 0; i < numberOfStudentsEnroll; i++) {
         student = new Student();
         student.enroll();
         student.tuitionPayment();
         enrolledStudent.add(student);
      }

      System.out.println("\n-----------Student Information ------------------");
      enrolledStudent.forEach(System.out::println);
   }
}
