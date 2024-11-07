package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        var startingChoice = Cli.getNum();
        final var choiceExit = 0;
        final var choiceGreet = 1;
        final var choiceEven = 2;
        final var choiceCalc = 3;
        final var choiceGcd = 4;
        final var choiceProgression = 5;
        final var choicePrime = 6;

        switch (startingChoice) {
            case choiceExit: // 0 - Exit
                System.out.println("See ya! :)");
                break;
            case choiceGreet: // 1 - Greet
                Cli.getGreet();
                break;
            case choiceEven: // 2 - Even ("Игра: Проверка на чётность")
                Cli.getGreet();
                Even.getEven();
                break;
            case choiceCalc: // 3 - Calc ("Игра: Калькулятор")
                Cli.getGreet();
                Calc.getCalc();
                break;
            case choiceGcd: // 4 - GCD ("Игра: Наибольший общий делитель")
                Cli.getGreet();
                Gcd.getGcd();
                break;
            case choiceProgression: // 5 - Progression ("Игра: Арифметическая прогрессия")
                Cli.getGreet();
                Progression.getProgression();
                break;
            case choicePrime: // 6 - Prime ("Игра: Простое число")
                Cli.getGreet();
                Prime.getPrime();
                break;
            default:
                System.out.println("Ops.. There is no option like " + startingChoice + " yet."); // Other...
        }

        Cli.closing();
    }
}
