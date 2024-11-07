package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void getCalc() {
        System.out.println("What is the result of the expression?");
        var countCorrectAnswers = 0;

        while (countCorrectAnswers < Engine.winnerPoints) {
            var firstNum = Engine.getRandNum1();
            var secondNum = Engine.getRandNum1();
            var operator = Engine.getOperator();
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
                default: System.out.println("Lost operator?");
            }
            var correctAnswer = Engine.getGameResult(result);

            if (correctAnswer) {
                countCorrectAnswers++;
            } else {
                break;
            }
        }

        Engine.congratulations(countCorrectAnswers);
    }
}
