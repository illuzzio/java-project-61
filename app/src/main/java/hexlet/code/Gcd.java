package hexlet.code;

public class Gcd {
    public static void getGcd() {
        System.out.println("Find the greatest common divisor of given numbers.");
        var countCorrectAnswers = 0;

        while (countCorrectAnswers < Engine.winnerPoints) {
            var num1 = Engine.getRandomNumber();
            var num2 = Engine.getRandomNumber();
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
