package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        scanner.close();
        return userName;
    }
}
