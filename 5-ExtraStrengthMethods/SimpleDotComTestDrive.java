public class SimpleDotComTestDrive{
    public static void main (String[] args){
        // Create an instance of SimpleDotComTest
        SimpleDotCom game = new SimpleDotCom();

        // Test an array of integers and pass on to SimpleDotCom Java
        int[] locations = {2,3,4};
        game.setLocationCells(locations);

        String userGuess = "2";

        String result = game.checkYourself(userGuess);

        String testResult = "failed";

        if (result.equals ("hit")){
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}