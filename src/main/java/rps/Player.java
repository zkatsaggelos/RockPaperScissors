package rps;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Player {

    private String name;
    private int counter;
    private int choice;
    Scanner input = new Scanner(System.in);
    private int x;


    public void userPick() {

    }

    public void setName(String message) {
        System.out.println(message);
        this.name = input.next();
    }

    public boolean playAgain() {
        if (input.nextLine().equals("N")) {
            return false;
        }
        return true;
    }

    public void setChoice(String message) {
        System.out.println(message);
      //  try {
        //} catch (InputMismatchException e) {
          //  System.out.println("Please enter 0, 1 or 2");
            this.choice = input.nextInt();
        // Consume the newline that is in the buffer
        this.input.nextLine();
    }



    public String getName() {
        return name;
    }

    public int getChoice() {
        return choice;

    }

    public int getAgain() {
        return x;
    }


}
