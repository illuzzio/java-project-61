package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void getProgression() {
        System.out.println("What number is missing in the progression?");
        var countCorrectAnswers = 0;
        final var lengthProgression = 10;

        while (countCorrectAnswers < Engine.getWinnerPoints()) {
            var progressionElements = new Integer[lengthProgression];
            var progressionElement = Engine.getRandNum0();
            var progression = Engine.getRandNum2();
            var missItem = Engine.getRandNum2();
            progressionElements[0] = progressionElement;

            for (var i = 1; i < lengthProgression; i++) {
                progressionElements[i] = progressionElements[i - 1] + progression;
            }

            var progressString = new StringBuilder();

            for (int i = 0; i < progressionElements.length; i++) {
                if (i == missItem) {
                    progressString.append(".. ");
                } else {
                    progressString.append(progressionElements[i]).append(" ");
                }
            }
            System.out.println("Question: " + progressString + " ");

            var correctAnswer = Engine.getGameResult(progressionElements[missItem]);

            if (correctAnswer) {
                countCorrectAnswers++;
            } else {
                break;
            }
        }

        Engine.congratulations(countCorrectAnswers);
    }
}
