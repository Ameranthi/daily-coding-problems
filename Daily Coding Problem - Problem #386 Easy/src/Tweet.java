import java.util.*;

public class Tweet{
    public static void main (String [] args){

        //instantiate the scanner
        Scanner in = new Scanner(System.in);
        //read in the string
        String inputtedString = in.nextLine();

        //begin sorting
        ArrayList <Character> stringList = new ArrayList<Character>();
        //add each character of the string to the array list
        for(int i = 0; i < inputtedString.length(); i++){
            stringList.add(inputtedString.charAt(i));
        }
        //System.out.println(stringList); //simple check

        //create hash map where key is the letter and value is the frequency that it appears
        TreeMap<Character, Counter> unique = new TreeMap<Character, Counter>();
        for (char c : stringList){
           if (unique.get(c) == null){
               unique.put(c, new Counter());
           }
            unique.get(c).addCounter();
        }

        TreeMap <Integer, ArrayList<Character>> letters = new TreeMap<Integer, ArrayList<Character>>();
            for(Character letter : unique.keySet()){
                if (letters.get(unique.get(letter).getCounter()) == null){
                    letters.put(unique.get(letter).getCounter(), new ArrayList<Character>());
                }
                letters.get(unique.get(letter).getCounter()).add(letter);
        }

            for(Integer count : letters.descendingKeySet()){
                for(Character letter : letters.get(count)){
                    for (int i = 0; i < count; i++){
                        System.out.print(letter);
                    }
                }
            }
            System.out.println();


    }
}
