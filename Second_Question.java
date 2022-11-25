import java.util.Scanner;

public class Second_Question {
    public static void main(String[] args) {
        System.out.println("Electric Bill ");
        System.out.println("Enter you reading UNIT ");
        Scanner sc = new Scanner(System.in);
        int reading = sc.nextInt();
        if (reading <= 100) {
            System.out.println("Your Bill Amount = " + reading * 10);
        } else if (reading <= 200) {
            System.out.println("Your total Amount " + ((100 * 10) + (reading - 100) * 15));

        } else if (reading <= 300) {
            System.out.println("Your total Amount " + ((100 * 10) + (100 * 15) + ((reading - 200) * 20)));

        } else if (reading > 300) {
            System.out.println("Your total Amount " + ((100 * 10) + (100 * 15) + (100 * 20) + ((reading - 300) * 25)));

        }
    }
}
