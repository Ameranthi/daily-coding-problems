import java.util.ArrayList;
import java.util.Scanner;

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

        //Count the amount of time a letter shows up


    }
}
