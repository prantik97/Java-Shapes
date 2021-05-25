package com.company;
import java.util.Random;
import java.util.Scanner;

class GuessGame{
    public int number;
    public int inputnumber;
    public int noOfGuesses;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    GuessGame(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
        //System.out.println(rand);
    }
    void takeUserInput(){
        System.out.println("Guess the number!! (HINT! Its='s below 100 ;) )");
        Scanner sc= new Scanner(System.in);
        inputnumber=sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputnumber == number){
            System.out.format("Yes you guessed it Right it was %d\n you guessed it in %d attempt", number, noOfGuesses);
            return  true;
        }
        else if (inputnumber<number){
            System.out.println("The number is too low");
        }
        else if(inputnumber>number)
            {
            System.out.println("The number is too high");
            }

            return false;
    }


}

public class game {
    public static void main(String[] args) {
        boolean b=false;
        GuessGame g = new GuessGame();
        while(!b) {

            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }

    }
}
