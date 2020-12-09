import com.sun.source.tree.Tree;

import java.util.TreeMap;

public class mapSumDemo {
    public static void main (String[] args){
        
        // make a map
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        PrefixMapSum prefixMapSum = new PrefixMapSum(map);

        //fill in the map
        prefixMapSum.insert("Ameranthi", 5);
        prefixMapSum.insert("Am", 8);
        prefixMapSum.insert("Ameranth", 54);
        prefixMapSum.insert("Ameran", 92);
        prefixMapSum.insert("Amer", 312);
        prefixMapSum.insert("Americe", 2);
        prefixMapSum.insert("Amir", 1);
        prefixMapSum.insert("Bob", 9000);

        System.out.println("Beginning: Looking for Prefix Am: "+prefixMapSum.sum("Am"));
        prefixMapSum.insert("Amir", 4000);
        System.out.println("After insert replacement: " +prefixMapSum.sum("Am"));

    }
}
