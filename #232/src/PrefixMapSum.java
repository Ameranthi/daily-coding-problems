
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author julia olmstead
 * December 9 2020
 *
 */

/*
DCP PROBLEM:
Good morning! Here's your coding interview problem for today.

This problem was asked by Google.

Implement a PrefixMapSum class with the following methods:

insert(key: str, value: int): Set a given key's value in the map. If the key already exists, overwrite the value.

sum(prefix: str): Return the sum of all values of keys that begin with a given prefix.
For example, you should be able to run the following code:

~~~ for JUnit Testing
mapsum.insert("columnar", 3)
assert mapsum.sum("col") == 3

mapsum.insert("column", 2)
assert mapsum.sum("col") == 5
 */

public class PrefixMapSum {

    TreeMap<String, Integer> map;
    public PrefixMapSum(TreeMap<String, Integer> map){
       this.map = map;
    }

    public void insert(String key, int value){//Set a given key's value in the map.
        // If the key already exists, overwrite the value.
        map.putIfAbsent(key,value);// if they key is not there then put it in with the value.
        if(map.containsKey(key)){ //if it contains it overwrite the value
            map.replace(key,value); //will overwrite anything
        }
    }
    public int sum(String prefix){
        int sum = 0;

        //for each key in the map...
        for (String key : map.keySet()) {
            if(key.startsWith(prefix)){ //does it start with the given Prefix?
                //yes, do summation
                sum += map.get(key); //gets the value and adds it onto sum
            } //else do nothing and continue iterating the map
        }
        return sum;//return the sum
    }
}
