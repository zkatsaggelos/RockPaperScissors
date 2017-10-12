package rps;
import java.util.Random;


public class computer {

    private Random randomGenerator = new Random();
    int randomInt;

    public void compPick(){
            int randomInt = randomGenerator.nextInt(3);
            switch(randomInt){
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

        public int getChoice(){
            return randomInt;
        }

    }

