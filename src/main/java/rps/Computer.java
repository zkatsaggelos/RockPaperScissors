package rps;

import java.util.Random;


public class Computer {

    private Random randomGenerator = new Random();
    private int randomInt;

    public void compPick() {
        randomInt = randomGenerator.nextInt(3);
        switch (randomInt) {
            case 0:
                System.out.println("Rock");
                break;
            case 1:
                System.out.println("Paper");
                break;
            case 2:
                System.out.println("Scissors");
                break;
        }
    }

    public int getChoice() {
        return randomInt;
    }

    public void computerDecide() {
        compPick();
    }

}

