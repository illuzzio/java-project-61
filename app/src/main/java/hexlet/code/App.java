package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n0 - Exit");
        System.out.print("Your choice: ");
        var startingChoice = Cli.getNum();

        switch (startingChoice) {
            case 0: // 0 - Exit
                System.out.println("See ya! :)");
                break;
            case 1: // 1 - Greet
                Cli.getGreet();
                break;
            case 2: // 2 - Even ("Игра: Проверка на чётность")
                Cli.getGreet();
                Even.getEven();
                break;
            case 3: // 3 - Calc ("Игра: Калькулятор")
                Cli.getGreet();
                Calc.getCalc();
                break;
            case 4: // 4 - GCD ("Игра: Наибольший общий делитель")
                Cli.getGreet();
                Gcd.getGcd();
                break;
            default:
                System.out.println("Ops.. There is no option like " + startingChoice + " yet."); // Other...
        }

        Cli.closing();
    }
}
