import java.util.*;

public class Tweet{
    public static void main (String [] args){

        //instantiate the scanner
        Scanner in = new Scanner(System.in);

        //read in the string
        String inputtedString = in.nextLine();

        //add string to list
        ArrayList stringList = new ArrayList<>();

        //add each character of the string to the array list
        for(int i = 0; i < inputtedString.length(); i++){
            stringList.add(inputtedString.charAt(i));
        }
        //System.out.println(stringList); //simple check

        //unique characters only list:
        Set uniqueChars = new HashSet(stringList);
        //System.out.println("uniqueList : " + uniqueChars); //simple check
        ArrayList uniqueCharsList = new ArrayList(uniqueChars);

        //sorted array
        ArrayList sortedArray = new ArrayList<>();
        //Count the amount of time a letter shows up
        for(int i =0; i < uniqueChars.size(); i++){
            int count = Collections.frequency(stringList, uniqueCharsList.get(i));
            if(count > 1){

            }
        }


    }
}
