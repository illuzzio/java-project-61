package hexlet.code;
import java.util.Random;

public class Even {
    public static void getEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var countCorrectAnswers = 0;
        while (countCorrectAnswers < 3) {
            var randNum = Even.getRandomNumber();
            System.out.print("Question: " + randNum + "\n");
            System.out.print("Answer: ");
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
        if (countCorrectAnswers == 3) {
            System.out.println("Congratulations, " + Cli.name + "!");
        }
    }


    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
