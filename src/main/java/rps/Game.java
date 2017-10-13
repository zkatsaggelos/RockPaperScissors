package rps;

public class Game {


    public GameState whoWins(Computer comp, Player player) {

        if (comp.getChoice() == player.getChoice()) {
            return GameState.DRAW;
        }


        if ((comp.getChoice() == 0) && (player.getChoice() == 1)) {
            System.out.println("Paper covers Rock: " + player.getName() + " wins");
            return GameState.WIN;
        } else if ((comp.getChoice() == 1) && (player.getChoice() == 0)) {
            System.out.println("Paper covers Rock: Computer wins");
            return GameState.LOSE;
        } else if ((comp.getChoice() == 1) && (player.getChoice() == 2)) {
            System.out.println("Scissors cuts Paper: " + player.getName() + " wins");
            return GameState.WIN;
        } else if ((comp.getChoice() == 0) && (player.getChoice() == 2)) {
            System.out.println("Rock crushes Scissors: Computer wins");
            return GameState.LOSE;
        } else if ((comp.getChoice() == 2) && (player.getChoice() == 0)) {
            System.out.println("Rock crushes Scissors: " + player.getName() + " wins");
            return GameState.WIN;
        } else if ((comp.getChoice() == 2) && (player.getChoice() == 1)) {
            System.out.println("Scissors cuts Paper: Computer wins");
            return GameState.LOSE;
        }

        return GameState.INVALID;
        // Should never hit
    }

}
