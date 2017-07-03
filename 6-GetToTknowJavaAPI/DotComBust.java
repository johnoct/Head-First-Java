import java.util.ArrayList;

public class DotComBust{

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    public void setUpGame(){
        // initialize the DotCom objects with the names and locations, 
        // Display brief instructions to the user.

        DotCom one = new DotCom();
        one.setName("amazon.com");
        DotCom two = new DotCom();
        two.setName("google.com");
        DotCom three = new DotCom();
        three.setName("facbeook.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink the three dot coms.");
        System.out.println("amazon.com, google.com, facebook.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for(DotCom dotComToSet : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    public void startPlaying(){
        while (!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        // method that asks the player for guesses
        // call checkUserGuess() untill all DotCom objects are removed from player
        finishGame();
    }

    public void checkUserGuess(String userGuess){

        numOfGuesses++;
        String result = "miss";

        for (DotCom dotComToCheck : dotComsList){
            result = dotComToCheck.checkYourself(userGuess);
            if (result.equals("hit")){
                break;
            }
            if (result == "kill"){
                dotComsList.remove(dotComToCheck);
                break;
            }
        }
        System.out.println(result);
        // loop through all remaning DotCom object
        // calls each DotCom object's checkYourself() method'
    }

    public void finishGame(){
        // prings a message about the user's performance, based on how many guesses it took to sink all of the DotComs
        System.out.println("All Dot Coms are dead! your stock is now worthless.");
        if (numOfGuesses <= 18){
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println(" You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }

    }
    public static void main(Stirng[] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
            
    }
}