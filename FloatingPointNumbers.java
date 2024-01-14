import java.util.Scanner;

public class FloatingPointNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	
	double total = 0;
	double max = Double.MIN_VALUE;
	double min = Double.MAX_VALUE;
	
	int count = 0;
	while (count < 5) {
		System.out.print("Enter a floating-point value: ");
		if (scanner.hasNextDouble()) {
			double value = scanner.nextDouble();
			
			// Update total
			total += value;
			
			// Update max and min
		if (value > max) {
			max = value;
		}
		if (value < min) {
			min = value;
		}
		count++;
		} else {
			System.out.println("Invalid Input. Please enter a valid floating-point value.");
			
			scanner.next(); // Consume Invalid Input
		}
	}
	    double average = total / 5;
	    double interest = total * 0.2;
	    
	    System.out.println("Total: " + total);
	    System.out.println("Average: " + average);
	    System.out.println("Maximum: " + max);
	    System.out.println("Minimum: " + min);
	    System.out.println("Interest on total at 20%: " + interest);
	    
	    scanner.close();
		}



	}
