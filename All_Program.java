import java.util.Scanner;

public class All_Program {
    public static void main(String[] args) {
        System.out.println("ENTER WHICH PART YOU WANT TO EXECUTE");
        System.out.println("For Check UPPERCASE or LOWERCASE press         => 1  and Enter");
        System.out.println("For Check Your input is Vowel or NOT press     => 2  and Enter");
        System.out.println("For Check Special Character press              => 3  and Enter");
        System.out.println("For Check Input is alphabet or not press       => 4  and Enter");

        Scanner sc = new Scanner(System.in);
        var num = sc.nextInt();
        if (num >= 5) {
            System.out.println("Choose correct number out of above four options ");
        } else {
            System.out.println("Thanks for choosing");

        }

        switch (num) {
            case 1: {
                // check for upper case

                System.out.println(" Enter a character for Checking Uppercase or Lowercase character...");
                char value = sc.next().charAt(0);
                System.out.println("Character: " + value);
                if (Character.isUpperCase(value)) {
                    System.out.println("Character is in Uppercase!");
                } else {
                    System.out.println("Character is in Lowercase!");
                }
            }

                break;

            case 2: {
                // check vowels

                System.out.println("Enter alphabet for check it is vowel or not");

                char ch = sc.next().charAt(0);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    System.out.println(ch + " is vowel");
                else
                    System.out.println(ch + " is consonant");

                break;
            }

            case 3: {

                // special character
                System.out.println("Enter any Special charcter for check");
                char ch1 = sc.next().charAt(0);

                if (Character.isDigit(ch1)) {

                    System.out.println(ch1 + " is a digit.");

                } else {

                    System.out.println(ch1 + " is Special Charcter.");

                }

                break;
            }

            case 4: {
                // alphabet or not
                System.out.println("Enter a character for check it is aplhabet or not");
                char ch2 = sc.next().charAt(0);

                if (Character.isAlphabetic(ch2)) {

                    System.out.println(ch2 + " is A ALPHABET.");

                } else {
                    System.out.println(ch2 + "is a not Aphlabet");
                }

            }

            default:
                break;
        }

    }

}
