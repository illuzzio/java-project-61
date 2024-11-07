package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static void getGcd() {
        System.out.println("Find the greatest common divisor of given numbers.");
        var countCorrectAnswers = 0;

        while (countCorrectAnswers < Engine.winnerPoints) {
            var num1 = Engine.getRandNum0();
            var num2 = Engine.getRandNum0();
            var result = Engine.gcd(num1, num2);
            System.out.println("Question: " + num1 + " " + num2 + " ");
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
