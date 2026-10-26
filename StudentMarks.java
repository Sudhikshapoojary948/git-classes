
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;

        System.out.println("\nStudent Name: " + name);
        System.out.println("Physics Marks: " + physics);
        System.out.println("Chemistry Marks: " + chemistry);
        System.out.println("Maths Marks: " + maths);
        System.out.println("Total Marks: " + total);

        sc.close();
    }
}
