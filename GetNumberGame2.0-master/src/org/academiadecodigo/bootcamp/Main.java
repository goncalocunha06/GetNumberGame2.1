package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) {


        Player goncalo = new Player("Gonçalo");
        Player diana = new Player("Diana");
        GameComposition gameComposition = new GameComposition(20);
        RandomNumber rand = new RandomNumber(gameComposition.getMaxGuess());
        GameLogic gameLogic = new GameLogic(goncalo , diana , gameComposition , rand);

        gameLogic.gameResolution();
        System.out.println(" The number i choosed between 0 and 20 is " + gameComposition.getNumberGoal());

/*        double[] arr1 = {1, 2, 23, 4, 5, 6, 7};
        arr1 = Array.array(arr1, 5);

        if (IsIn.isIN(arr1, 26.0)) {
            System.out.println("yep");
        } else System.out.println("nop");

        for (int i=0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }*/
    }
}


