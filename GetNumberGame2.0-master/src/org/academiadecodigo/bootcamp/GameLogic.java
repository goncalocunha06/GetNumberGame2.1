package org.academiadecodigo.bootcamp;

public class GameLogic {

    private Player player1;
    private Player player2;
    private GameComposition gameComposition;
    private RandomNumber randomNumber;

    public GameLogic (Player player1, Player player2, GameComposition gameComposition, RandomNumber randomNumber){

        this.player1 = player1;
        this.player2 = player2;
        this.gameComposition = gameComposition;
        this.randomNumber = randomNumber;

    }

    public void gameResolution () {

        gameComposition.setNumberGoal(Math.floor(randomNumber.numberPicked()* gameComposition.getMaxGuess()));
        double gameMaxGuess = gameComposition.getNumberGoal();
        randomNumber.numberLocked(player1, gameComposition);
        randomNumber.numberLocked(player2, gameComposition);
        boolean gameStop = false;


        while (!gameStop) {

            randomNumber.numberLocked(player1, gameComposition);
            randomNumber.numberLocked(player2, gameComposition);
            if (gameMaxGuess == player1.getPlayerGuess()) {
                    System.out.println("The winner is " + player1.getPlayerName() + " the number " + player1.getPlayerGuess());
                    gameStop = true;
                    break;
                } else {
                    System.out.println("wrong guess " + player1.getPlayerName() + " the number " + player1.getPlayerGuess());

                }
                if (gameMaxGuess == player2.getPlayerGuess()) {
                        System.out.println("The winner is " + player2.getPlayerName() + " the number " + player2.getPlayerGuess());
                        gameStop = true;
                        break;

                    } else
                    System.out.println("wrong guess " + player2.getPlayerName() + " the number " + player2.getPlayerGuess());
                }
            }
        }


