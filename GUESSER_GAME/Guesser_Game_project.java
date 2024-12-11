import java.util.Scanner;

class Guesser{
    int guessNumber;
    public int guessANumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Guess a number: ");
        guessNumber=sc.nextInt();
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
    int playerNumber1;
    int playerNumber2;
    int playerNumber3;

    public void takeNumberFromGuesser(){
        //Take number the Guesser Person.
        Guesser guesser=new Guesser();
        guesserNumber= guesser.guessANumber();
    }
    public void takeNumberFromPlayers(){
        //Take number from Player 1.
        Players player1=new Players();
        playerNumber1=player1.guessANumber();

        //Take number from Player 2.
        Players player2=new Players();
        playerNumber2=player2.guessANumber();

        //Take number from Player 3.
        Players player3=new Players();
        playerNumber3=player3.guessANumber();
    }
    public void compareNumbers(){
        if(playerNumber1==guesserNumber){
            if(playerNumber2==guesserNumber && playerNumber3==guesserNumber)
                System.out.println("All the Players won the Game!!");
            else if(playerNumber2==guesserNumber)
                System.out.println("Only Player-1 and Player-2 won the game!!");
            else if(playerNumber3==guesserNumber)
                System.out.println("Only Player-1 and Player-3 won the game!!");
            else
                System.out.println("Only Player-1 won the game!!");
        }
        else if(playerNumber2==guesserNumber){
            if(playerNumber3==guesserNumber)
                System.out.println("Only Player-1 and Player-2 won the game!!");
            else
                System.out.println("Only Player-2 won the game!!");
        }
        else if(playerNumber3==guesserNumber){
            System.out.println("Only Player-3 won the game!!");
        }
        else{
            System.out.println("No Player won the game!!");
        }
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