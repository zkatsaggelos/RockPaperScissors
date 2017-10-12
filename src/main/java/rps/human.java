package rps;
import java.util.Scanner;

public class human {

    private String name;
    private int counter;
    private int choice;
    Scanner user_input = new Scanner(System.in);
    private int x;


    public void userPick() {

    }

    public void setName(String message){
        System.out.println(message);
        this.name = user_input.next();

    }

    public void setChoice(String choice){
        System.out.println(choice);
        this.choice = user_input.nextInt();

    }

    public String getName(){
        return name;
    }

    public int getChoice(){
        return choice;

    }

}
