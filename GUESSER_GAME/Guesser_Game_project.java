import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Guesser{
    int guessNumber;
    public int guessANumber(){
        Random random=new Random();
        guessNumber=random.nextInt(100);
        return guessNumber;
    }
}

class Players{
    int playerNumber;
    public int guessANumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Guess a number: ");
        playerNumber=sc.nextInt();
        return playerNumber;
    }
}

class Umpire{
    int guesserNumber;
    List<Integer> list=new ArrayList<Integer>();
    public void takeNumberFromGuesser(){
        //Take number the Guesser Person.
        Guesser guesser=new Guesser();
        guesserNumber= guesser.guessANumber();
        System.out.println(guesserNumber);
    }
    public void takeNumberFromPlayers(){
        Scanner sc=new Scanner(System.in);
        Players players=new Players();
        int a=0;
        do {
            list.add(players.guessANumber());
            System.out.println("If You want to contribute more guess value then press '1' otherwise '0': ");
            a=sc.nextInt();
        } while (a==1);
        sc.close();
    }
    public void compareNumbers(){
        int result=list.indexOf(guesserNumber);
        if(result==-1)
            System.out.println("No one will won the game!!\nThe actual number is: "+guesserNumber);
        else
            System.out.println("Congradulations!!!\nPlayer no. : "+(result+1)+" won the game!!");
    }
}

public class Guesser_Game_project {
    public static void main(String[] args) {
        Umpire umpire=new Umpire();
        umpire.takeNumberFromGuesser();
        umpire.takeNumberFromPlayers();
        umpire.compareNumbers();
    }
}