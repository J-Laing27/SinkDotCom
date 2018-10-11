// Jordan Laing - 15009237
// Last Modified - 11/10/2018
// SimpleDotCom.class - checks user guesses against stored variables


public class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locations) {  //constructor
        locationCells = locations;
    }

    public String checkYourself(String stringGuess) {  //check to see if the user has guess a correct cell
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for(int cell : locationCells) {
            if(guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if(numOfHits == locationCells.length) { //IF the user has hit all points, return 'kill'
            result = "kill";
        }

        System.out.println(result);
        return result;
    }
}
