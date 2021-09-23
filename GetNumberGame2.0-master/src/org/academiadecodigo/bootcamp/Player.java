package org.academiadecodigo.bootcamp;

public class Player {

    private String playerName;
    private double playerGuess;
    //   private static Integer playersNumber;

    public Player (String playerName) {
        this.playerName = playerName;
        playerGuess = 0;
      //  playersNumber++;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerGuess(double playerGuess) {
        this.playerGuess = playerGuess;
    }

/*    public static Integer getPlayersNumber() {
        return playersNumber;
    }*/

    public double getPlayerGuess() {
        return playerGuess;
    }
}

