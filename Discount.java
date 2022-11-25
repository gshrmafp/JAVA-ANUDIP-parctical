import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        System.out.println("Welcome in My JAVA PROGRAM 😊");
        System.out.println("Can u please enter the amount for checking Discount percentage");
        Scanner s = new Scanner(System.in);
        float UserAmount = s.nextFloat();

        System.out.println("Your Entered Amount is ₹ " + UserAmount);

        if (UserAmount <= 800) {
            System.out.println("No Discount on ₹" + UserAmount + " amount ");

        } else if (UserAmount <= 1500) {
            System.out.println("you WON 10% Discount");

        } else if (UserAmount <= 2500) {
            System.out.println("you WON 20% Discount");

        } else if (UserAmount <= 5000) {
            System.out.println("you WON 30% Discount");

        } else if (UserAmount <= 10000) {
            System.out.println("you WON 30% Discount");

        }

    }

}
