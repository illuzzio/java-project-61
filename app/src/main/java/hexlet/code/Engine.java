package hexlet.code;
import java.util.Random;

public class Engine {
    static final int WINNERPOINTS = 3;
    static final int COUNT100 = 100;
    static final int COUNT20 = 20;
    static final int COUNT10 = 10;
    static final int COUNT3 = 3;

    public static int getWinnerPoints() {
        return WINNERPOINTS;
    }

    public static int getRandNum0() {
        Random random = new Random();
        return random.nextInt(COUNT100);
    }

    public static int getRandNum1() {
        Random random = new Random();
        return random.nextInt(COUNT20) - COUNT10;
    }

    public static int getRandNum2() {
        Random random = new Random();
        return random.nextInt(COUNT10);
    }

    public static String getOperator() {
        String[] operators = {"+", "-", "*"};
        Random random = new Random();
        var i = random.nextInt(COUNT3);
        return operators[i];
    }

    public static int gcd(int num1, int num2) {

        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }

    public static boolean getGameResult(int result) {
        System.out.print("Your answer: ");
        var answer = Cli.getNum();

        if (result == answer) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            System.out.println("Let's try again, " + Cli.getName() + "!");
            return false;
        }
    }

    public static boolean getGameResult(String result) {
        System.out.print("Your answer: ");
        var answer = Cli.getLine().toLowerCase();

        if (result.equals(answer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            System.out.println("Let's try again, " + Cli.getName() + "!");
            return false;
        }
    }

    public static boolean isPrime(int number) {
        // числа меньше 2 не являются простыми
        if (number <= 1) {
            return false;
        }

        // проверяем делители от 2 до кв.корня из числа
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void congratulations(int countPoints) {

        if (countPoints == Engine.WINNERPOINTS) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}
