public class GuessGame{

    //Intialize instance variables for the Player Objects
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){

        //Create the three player objects
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        //Create guesses holder
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        //Create isRight holder
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        //Generate the target number to guess
        int targetNumber = (int) (Math.random() * 10);
        
        System.out.println("The number to guess is " + targetNumber);

        //Start Guessing
        while(true){
            //Players Guess
            p1.guess();
            p2.guess();
            p3.guess();

            //Players Guessed
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            //Check if players guessed correctly

            if (guessp1 == targetNumber){
                p1isRight = true;
            }
            if (guessp2 == targetNumber){
                p2isRight = true;
            }
            if (guessp3 == targetNumber){
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight){
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                break;
            } else {
                System.out.println("WPlayers will have to try again.");
            }
        }
    }
}