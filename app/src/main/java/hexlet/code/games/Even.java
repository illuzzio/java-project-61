package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void getEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var countCorrectAnswers = 0;

        while (countCorrectAnswers < Engine.getWinnerPoints()) {
            var randNum = Engine.getRandNum0();
            System.out.print("Question: " + randNum + "\n");
            var result = (randNum % 2 == 0) ? "yes" : "no";
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
