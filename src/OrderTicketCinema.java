import java.util.Arrays;
import java.util.Scanner;

public class OrderTicketCinema {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] seat = new String[10][10];
        String name;
        int lineSeat, numberSeat;

        // Initialize seat

        for (String[] item : seat) {
            Arrays.fill(item, "-");
        }

        System.out.println("Welcome To Purwakarta Cinema");
        System.out.println("----------------------------");
        System.out.println("Here is the seating layout cinema");
        for (String[] value : seat) {
            for (String s : value) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

        // Input name costumer and choose seating
        System.out.println("\nPlease input your name: ");
        name = input.nextLine();
        System.out.println("please choose your line (1-10): ");
        lineSeat = input.nextInt();
        System.out.println("Please choose your number seat (1-10: ");
        numberSeat = input.nextInt();

        //Check seat availability
        if (seat[lineSeat -1][numberSeat -1].equals("-")){
            seat[lineSeat -1][numberSeat -1] = "X";
            System.out.println("\nThank You, " + name + " Your seat was successfully booked");
        } else {
            System.out.println("\nSorry, the seat has been reserved. Please choose another seat");
        }

        //Show layout new seat
        for (String[] strings : seat) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
