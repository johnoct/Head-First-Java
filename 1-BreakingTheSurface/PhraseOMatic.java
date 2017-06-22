public class PhraseOMatic{
    public static void main (String[] args){
        
        // make three sets of words to choose from
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};

        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered","branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accellerated"};

        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "stragey", "mindshare", "portal", "space" , "vision", "paradigm", "mission"};

        //find out how many words in each wordListOne
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //now build a Phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //print out the phrase
        System.out.println(phrase);

    }

}