import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int roomType;
        int nights;
        int totalRooms = 0;
        int totalNights = 0;
        int totalCost = 0;
        boolean bookAnother = true;

        while (bookAnother) {
            System.out.println("Welcome to the Hotel California!");
            System.out.println("What type of room would you like to book?");
            System.out.println("1. Single bed");
            System.out.println("2. Double bed");
            System.out.println("3. King bed");
            System.out.print("Enter the number of the room you would like to book: ");
            roomType = input.nextInt();

            System.out.print("How many nights would you like to book? ");
            nights = input.nextInt();

            switch (roomType) {
                case 1:
                    totalCost += 50 * nights;
                    break;
                case 2:
                    totalCost += 75 * nights;
                    break;
                case 3:
                    totalCost += 100 * nights;
                    break;
                default:
                    System.out.println("Invalid room type.");
                    break;
            }

            totalRooms++;
            totalNights += nights;

            System.out.print("Would you like to book another room? (y/n) ");
            String answer = input.next();
            if (answer.equals("n")) {
                bookAnother = false;
            }
        }

        System.out.println("Total rooms booked: " + totalRooms);
        System.out.println("Total nights booked: " + totalNights);
        System.out.println("Total cost: $" + totalCost);
    }
}