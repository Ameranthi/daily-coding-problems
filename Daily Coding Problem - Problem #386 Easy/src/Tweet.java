import java.util.*;

public class Tweet{
    public static void main (String [] args){

        //instantiate the scanner
        Scanner in = new Scanner(System.in);
        //read in the string
        String inputtedString = in.nextLine();
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

        //create hash map where key is the letter and value is the frequency that it appears
        HashMap frequency = new HashMap();
        for (int i = 0; i < uniqueChars.size(); i++){
            frequency.put(uniqueCharsList.get(i), Collections.frequency(stringList,uniqueCharsList.get(i)));
        }

        //create a new list
        ArrayList sortedArray = new ArrayList<>();

        // adding the key with the largest value v amount of times to the list

        for(int i = 0; i < stringList.size(); i++){
            for(int j = 0; i < )
            sortedArray.add();
        }






    }
}
