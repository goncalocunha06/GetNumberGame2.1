package org.academiadecodigo.bootcamp;

public class GameComposition {

    private Integer maxGuess;
    private double numberGoal;


    public GameComposition(Integer maxGuess) {
        this.maxGuess = maxGuess;
    }

    public Integer getMaxGuess() {
        return maxGuess;
    }

    public void setNumberGoal(double numberGoal) {
        this.numberGoal = numberGoal;
    }

    public double getNumberGoal() {
        return numberGoal;
    }
}
