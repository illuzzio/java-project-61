package hexlet.code;

public class Even {
    public static void getEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var countCorrectAnswers = 0;

        while (countCorrectAnswers < Engine.winnerPoints) {
            var randNum = Engine.getRandomNumber();
            System.out.print("Question: " + randNum + "\n");
            System.out.print("Your answer: ");
            var answer = Cli.getLine().toLowerCase();
            var correctAnswer = (randNum % 2 == 0) ? "yes" : "no";

            if (answer.equals(correctAnswer)) {
                countCorrectAnswers++;
                System.out.println("Correct!");
            } else {
                System.out.println("Let's try again, " + Cli.name + "!");
                break;
            }
        }

        Engine.congratulations(countCorrectAnswers);
    }
}
