package rps;

import java.util.Scanner;

public class App {

    public static void main(String args[]) {

        computer Game = new computer();
        human Person = new human();


        Person.setName("Enter your name");

        while (true) {
            Person.setChoice("Enter:" + "\n" + "0 for Rock" + "\n" + "1 for Paper" + "\n" + "2 for Scissors");



            if ((Game.getChoice() == 0) && (Person.getChoice() == 0)) {
                System.out.println("Draw, please try again");
            } else if ((Game.getChoice() == 1) && (Person.getChoice() == 1)) {
                System.out.println("Draw, please try again");
            } else if ((Game.getChoice() == 2) && (Person.getChoice() == 2)) {
                System.out.println("Draw, please try again");
            } else if ((Game.getChoice() == 0) && (Person.getChoice() == 1)) {
                System.out.println("Paper covers Rock: " + Person.getName() + " wins");
                break;
            } else if ((Game.getChoice() == 1) && (Person.getChoice() == 0)) {
                System.out.println("Paper covers Rock: Computer wins");
                break;
            } else if ((Game.getChoice() == 1) && (Person.getChoice() == 2)) {
                System.out.println("Scissors cuts Paper: " + Person.getName() + " wins");
                break;
            } else if ((Game.getChoice() == 0) && (Person.getChoice() == 2)) {
                System.out.println("Rock crushes Scissors: Computer wins");
                break;
            } else if ((Game.getChoice() == 2) && (Person.getChoice() == 0)) {
                System.out.println("Rock crushes Scissors: " + Person.getName() + " wins");
                break;
            } else if ((Game.getChoice() == 2) && (Person.getChoice() == 1)) {
                System.out.println("Scissors cuts Paper: Computer wins");
                break;
            }

            System.out.println("Please enter a valid number");
        }


    }

}




