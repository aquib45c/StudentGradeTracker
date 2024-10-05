import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        boolean addingGrades = true;

        // Input: Collecting grades from the teacher
        while (addingGrades) {
            System.out.print("Enter a student's grade (or -1 to finish): ");
            double grade = scanner.nextDouble();

            if (grade == -1) { // Stop when teacher enters -1
                addingGrades = false;
            } else if (grade >= 0 && grade <= 100) {
                grades.add(grade); // Add valid grade (0-100)
            } else {
                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            }
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            // Calculating average, highest, and lowest grades
            double average = calculateAverage(grades);
            double highest = Collections.max(grades);
            double lowest = Collections.min(grades);

            // Output: Displaying the results
            System.out.println("\nGrades Summary:");
            System.out.println("Grades: " + grades);
            System.out.println("Average Grade: " + average);
            System.out.println("Highest Grade: " + highest);
            System.out.println("Lowest Grade: " + lowest);
        }

        scanner.close(); // Close scanner
    }

    // Method to calculate the average of the grades
    public static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
