package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String name;

    public static String getLine() {
        Scanner scanner = new Scanner(System.in);
        String output = scanner.nextLine().trim();
        return output;
    }

    public static int getNum() {
        Scanner scanner = new Scanner(System.in);
        int output = scanner.nextInt();
        return output;
    }

    public static void closing() {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }

    public static void getGreet() {
        System.out.print("May I have your name? ");
        name = getLine();
        System.out.println("Hello, " + name + "!");

    }
}
