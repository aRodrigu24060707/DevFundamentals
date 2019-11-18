import java.io.Console;

/**
 * Phone validator
 * Enter the phone number you want to validate: 7878648
 * Your phone number "7878648" is not valid.
 * Enter the phone number you want to validate: 0010 4352 4242424
 * Your phone number "0010 4352 4242424" is valid.
 */
public class Exercise1 {

    public static void main(String[] arg) {
        Console console = System.console();
        String phoneNumber = console.readLine("Enter the phone number you want to validate:");
        boolean isValidPhoneNumber = phoneNumber.matches("/d(?:-/d{3}){3}/d");
        if (isValidPhoneNumber) {
            System.out.println("Your phone number: " + phoneNumber + " is valid");
        } else {
            System.out.println("Your phone number:" + phoneNumber + " is invalid");
        }
    }


}
