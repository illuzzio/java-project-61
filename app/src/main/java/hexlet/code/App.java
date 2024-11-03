package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n0 - Exit");
        var startingChoice = Cli.getNum();
        System.out.println("Your choice: " + startingChoice);

        if (startingChoice == 1) { // 1 - Greet
            Cli.getGreet();
        }

        else if (startingChoice == 2) { // 2 - Even ("Игра: Проверка на чётность")
            Cli.getGreet();
            Even.getEven();
        }
        else if (startingChoice == 0) {
            System.out.println("See ya! :)");
        }
        else {
            System.out.println("Ops.. There is no option like " + startingChoice + " yet.");
        }

        Cli.closing();
    }
}
