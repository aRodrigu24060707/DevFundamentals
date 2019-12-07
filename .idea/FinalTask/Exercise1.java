import java.io.Console;
import java.lang.Math;

public class Exercise1 {

    public static void main(String[] arg) {
        String ip = System.console().readLine("Please enter IP:");
        boolean isIpCorrect = ip.matches("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        System.out.println("The IP is correct? : " + isIpCorrect);
    }
}
