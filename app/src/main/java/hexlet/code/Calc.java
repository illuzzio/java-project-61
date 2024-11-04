package hexlet.code;
import java.util.Random;

public class Calc {
    public static void getCalc() {
        System.out.println("What is the result of the expression?");
        var countCorrectAnswers = 0;
        while (countCorrectAnswers < 3) {
            var firstNum = getRandNum1();
            var secondNum = getRandNum2();
            var operator = getOperator();
            var result = 0;
            System.out.println("Question: " + firstNum + " " + operator + " " + secondNum);
            switch (operator) {
                case ("+"):
                    result = firstNum + secondNum;
                    break;
                case ("-"):
                    result = firstNum - secondNum;
                    break;
                case ("*"):
                    result = firstNum * secondNum;
                    break;
                default: System.out.println("Lost operator");
            }
            System.out.print("Your answer: ");
            var answer = Cli.getNum();
            if (result == answer) {
                countCorrectAnswers++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                break;
            }
        }
        if (countCorrectAnswers == 3) {
            System.out.println("Congratulations, " + Cli.name + "!");
        }
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
}
