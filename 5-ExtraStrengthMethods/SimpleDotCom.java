public class SimpleDotCom{
    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }
    public String checkYourself(String guess){
        //Convert the string to an integer
        //Integer is a class that ships with Java
        //parseInt is a method in the Integer class that knows how to parse a string to its integer equivalent"
        int guess = Integer.parseInt(stringGuess);

        //result by default is a miss, we're returning result
        String result = "miss";

        //repeat with each cell in the locationCells array (each cell location of the object)
        for (int cell: locationCells){

            //Check if the guess is the cell 
            if (guess == cell){
                //set result to hit if true
                result = "hit";
                //increment number of Hits
                numOfHits++;
                //get out of the loop, no need to test the other cells
                break;
            }

        }
        
        //Find out if that was the last cell
        if (numOfHits == locationCells.length){
            result = "kill";
        }
        
        System.out.println(result);
        return result;
    }
}