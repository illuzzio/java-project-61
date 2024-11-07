package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void getPrime() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        var countCorrectAnswers = 0;

        while (countCorrectAnswers < Engine.winnerPoints) {
            var number = Engine.getRandNum0();
            System.out.print("Question: " + number + "\n");
            var result = (Engine.isPrime(number)) ? "yes" : "no";
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
