public class Overload{
    String UniqueID;

    // Takes in two integers and adds them
    public int addNums(int a, int b){
        return a + b;
    }

    // Takes in two doubles and returns a doubles
    public double addNums(double a, double b){
        return a + b;
    }

    // Set Unique UniqueID
    public void setUniqueID(String uniqueID){
        UniqueID = uniqueID;
    }

    //
    public void setUniqueID(int SSID){
        String numString = "" + SSID;
        setUniqueID(numString);
    }


}