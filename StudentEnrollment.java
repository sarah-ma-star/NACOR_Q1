import java.util.Scanner;

public class StudentEnrollment {

    // Method to calculate total fee based on the number of units
    public static int calculateTotalFee(int numberOfUnits) {
        int feePerUnit = 1000; // Set fee per unit
        return numberOfUnits * feePerUnit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Student Information
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Course Name: ");
        
        int numberOfUnits = 0;
        // Ensure number of units does not exceed 10
        do {
            System.out.print("Enter Number of Units (Max 10): ");
            numberOfUnits = scanner.nextInt();
            if (numberOfUnits > 10) {
                System.out.println("Error: Number of units cannot exceed 10.");
            }
        } while (numberOfUnits > 10);

        // Compute total enrollment fee
        int totalFee = calculateTotalFee(numberOfUnits);

        // Output: Display student name and total enrollment fee
        System.out.println("\n--- Enrollment Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Enrollment Fee: " + totalFee + " PHP");

        // Payment
        System.out.print("\nEnter Payment Amount: ");
        int payment = scanner.nextInt();

        // Check payment status
        if (payment == totalFee) {
            System.out.println("Fully Paid");
        } else if (payment < totalFee) {
            System.out.println("Partial Payment. Amount Paid: " + payment + " PHP");
            System.out.println("Remaining Balance: " + (totalFee - payment) + " PHP");
        } else {
            System.out.println("Overpaid. Please contact the administration.");
        }

        scanner.close();
    }
}
