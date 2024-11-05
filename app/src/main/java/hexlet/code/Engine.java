package hexlet.code;
import java.util.Random;

public class Engine {
    public static int winnerPoints = 3;

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static int getRandNum1() {
        Random random = new Random();
        return random.nextInt(20) - 10;
    }

    public static int getRandNum2() {
        Random random = new Random();
        return random.nextInt(20) - 10;
    }

    public static String getOperator() {
        String[] operators = {"+", "-", "*"};
        Random random = new Random();
        var i = random.nextInt(3);
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
            System.out.println("Let's try again, " + Cli.name + "!");
            return false;
        }
    }

    public static void congratulations(int countPoints) {
        if (countPoints == Engine.winnerPoints) {
            System.out.println(
                    "\n  Congratulations, " + Cli.name + "! \n" +
                    "                        .--.\n" +
                    "                       |o_o |\n" +
                    "                       |:_/ |\n" +
                    "                      //   \\ \\\n" +
                    "                     (|     | )\n" +
                    "                    /'\\_   _/`\\\n" +
                    "                    \\___)=(___/"
            );
        }
    }
}
