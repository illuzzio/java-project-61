package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String newName) {
        name = newName;
    }

    public static String getLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }

    public static int getNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void closing() {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }

    public static void getGreet() {
        System.out.print("Welcome to the 'Brain Games'!\nMay I have your name? ");
        setName(getLine());
        System.out.println("Hello, " + getName() + "!");
    }
}
