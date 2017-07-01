import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.generic.L2D;

public class DotCom{

    private ArralyList<String> locationCells;
    // int[] locationCells;
    // int numOfHits;

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    public String checkYourself(String userInput){

        // record initial result
        String result = "miss";

        // Ask for index of the guess, if its -1, then its not in the ArrayList
        int index = locationCells.indexOf(userInput);

        if (index >= 0){

            // remove the string at the index of the guess in the arrayList
            locationCells.remove(index);

            // after removing the index of the array list, check if its empty now
            if (locationCells.isEmpty()){
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}