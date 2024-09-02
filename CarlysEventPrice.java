import java.util.Scanner;

public class CarlysCatering {
    public static void main(String[] args) {
        // Define the company motto
        String companyMotto = "Carly's Catering: Your event, our expertise!";

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of guests
        System.out.print("Enter the number of guests attending the event: ");
        int numGuests = scanner.nextInt();

        // Define the price per person
        final int PRICE_PER_PERSON = 35;

        // Compute the total price
        int totalPrice = numGuests * PRICE_PER_PERSON;

        // Display the company motto
        System.out.println(companyMotto);

        // Display the number of guests, price per guest, and total price
        System.out.println("Number of guests: " + numGuests);
        System.out.println("Price per guest: $" + PRICE_PER_PERSON);
        System.out.println("Total price: $" + totalPrice);

        // Determine if the event is large or not
        boolean isLargeEvent = numGuests >= 50;

        // Display a message indicating if the job is classified as a large event
        System.out.println("Is the event classified as large? " + isLargeEvent);
    }
