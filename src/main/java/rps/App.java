package rps;

public class App {

    public static void main(String args[]) {

        Computer comp = new Computer();
        Player player = new Player();
        Game game = new Game();
        System.out.println("Welcome to Rock, Paper, Scissors! Let's Begin");
        player.setName("Enter your name");

        boolean replay = true;

        while (replay) {
            player.setChoice("Enter:" + "\n" + "0 for Rock" + "\n" + "1 for Paper" + "\n" + "2 for Scissors");
            comp.compPick();

            switch (game.whoWins(comp, player)) {
                case DRAW:
                    System.out.println("Draw, please try again");
                    break;
                case WIN:
                    System.out.println("Play again? Enter Y for Yes and N for No");
                    replay = player.playAgain();
                    break;
                case LOSE:
                    System.out.println("Play again? Enter Y for Yes and N for No");
                    replay = player.playAgain();
                    break;
                case INVALID:
                    System.out.println("Please enter a valid option");
                    break;
            }
        }



    }

}




