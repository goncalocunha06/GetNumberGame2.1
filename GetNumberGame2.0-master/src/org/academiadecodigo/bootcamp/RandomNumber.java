package org.academiadecodigo.bootcamp;



public class RandomNumber {
    double[] listOfGuesses;
    int i = 0;

    public RandomNumber (int x){
        listOfGuesses = new double[x];
    }

    public double numberPicked() {

        return (Math.random());
    }

    public void numberLocked(Player player, GameComposition gameComposition) {


        double numberGuess = Math.floor(Math.random() * gameComposition.getMaxGuess());
        player.setPlayerGuess(numberGuess);

        boolean c = true;


        while (c) {

            if (isIn(listOfGuesses, numberGuess)) {
                numberGuess = Math.floor(Math.random() * gameComposition.getMaxGuess());
            }
            if (!isIn(listOfGuesses, numberGuess)) {
                player.setPlayerGuess((numberGuess));
                listOfGuesses[i] = numberGuess;
                i++;
            //   listOfGuesses = Array.array(listOfGuesses, numberGuess);
                c = false;
            }

        }


    }
    
    public static Boolean isIn(double[] arr , Double n){
        for (int i =0; i < arr.length;i++){
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }

    public void getListOfGuesses() {
        for (int i = 0; i < this.listOfGuesses.length; i++) {
            System.out.println(this.listOfGuesses[i]);

        }
    }
}
