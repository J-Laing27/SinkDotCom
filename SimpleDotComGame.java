// Jordan Laing - 15009237
// Last Modified - 11/10/2018
// SimpleDotComGame.class - contains main method

public class SimpleDotComGame {

    public static void main(String[] args) {

        int numberOfGuesses = 0; //user guess counter

        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();

        int randomNumber = (int)(Math.random()*5);

        int[] locations = {randomNumber, randomNumber+1, randomNumber+2}; //sets 3 continuous locations as a dotCom location

        theDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while(isAlive){
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numberOfGuesses++;

            if(result.equals("kill")){

                isAlive = false;
                System.out.println("You took "+numberOfGuesses+" guesses");
            }
        }
    }
}