import java.util.Scanner;

public class SammysSeashoreSupplies {
    public static void main(String[] args) {
        // Define Sammy's motto
        String sammysMotto = "Sammy's Seashore Supplies: Enjoy the best beach experience!";
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of minutes rented
        System.out.print("Enter the number of minutes rented: ");
        int totalMinutes = scanner.nextInt();

        // Define the rental cost rates
        final int RATE_PER_HOUR = 40;
        final int RATE_PER_MINUTE = 1;
        final int MINUTES_PER_HOUR = 60;

        // Compute the number of full hours and remaining minutes
        int hours = totalMinutes / MINUTES_PER_HOUR;
        int minutes = totalMinutes % MINUTES_PER_HOUR;

        // Compute the rental cost
        int totalCost = (hours * RATE_PER_HOUR) + (minutes * RATE_PER_MINUTE);

        // Display Sammy's motto
        System.out.println(sammysMotto);

        // Display the hours, minutes, and total price
        System.out.println("Hours rented: " + hours);
        System.out.println("Minutes rented: " + minutes);
        System.out.println("Total price: $" + totalCost);
    }
}
