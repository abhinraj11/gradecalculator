import java.util.*;

public class GradeCalculator {
    public static void main(String args[]) {
        // This program assumes that the student has 6 subjects.
        // You can change this as per the requirement.

        int marks[] = new int[6];
        int i;
        float total = 0, avg;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks for 6 subjects:");

        for (i = 0; i < 6; i++) {
            System.out.println("Enter Marks of Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();

            // Input validation for marks (assuming a range of 0 to 100)
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
                System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
            }

            total = total + marks[i];
        }

        scanner.close();

        // Calculating average here
        avg = total / 6;

        System.out.print("The student Grade is: ");
        if (avg >= 80) {
            System.out.println("A");
        } else if (avg >= 60 && avg < 80) {
            System.out.println("B");
        } else if (avg >= 40 && avg < 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
