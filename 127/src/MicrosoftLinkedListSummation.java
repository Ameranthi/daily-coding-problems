import java.util.LinkedList;
import java.util.Scanner;

/**
 * Daily coding problem completed by
 * @author Julia Olmstead
 * December 9th 2020
 */
/*
Good morning! Here's your coding interview problem for today.
This problem was asked by Microsoft.

Let's represent an integer in a linked list format by having each node represent a digit in the number. The nodes make up the number in reversed order.
For example, the following linked list:
1 -> 2 -> 3 -> 4 -> 5
is the number 54321.

Given two linked lists in this format, return their sum in the same linked list format.
For example, given
9 -> 9
5 -> 2
return 124 (99 + 25) as:

4 -> 2 -> 1
 */
public class MicrosoftLinkedListSummation {
    public static void main (String [] args){

        Scanner in = new Scanner(System.in);

        LinkedList<Integer> ll1 = new LinkedList<Integer>();
        LinkedList<Integer> ll2 = new LinkedList<Integer>();

        System.out.println("Please enter a positive integer to fill up the first linked list, enter -1 to break:");
        while(in.hasNextInt()){
            int number = in.nextInt();
            if(number == -1){
                break;
            } else{
                ll1.addFirst(number);
            }
        }
        System.out.println("Please enter a positive integer to fill up the second linked list, enter -1 to break:");
        while(in.hasNextInt()){
            int number = in.nextInt();
            if(number == -1){
                break;
            }else{
                ll2.addFirst(number);
            }
        }

        //add in test data
//        ll1.add(9); ll1.addFirst(9);
//        ll2.add(2); ll2.addFirst(5);

        //checking that it was added correctly:
        System.out.println(llToString(ll1));
        System.out.println(llToString(ll2));

        String list1Number = "";

        //read them tail to head
        for (int i = ll1.size()-1; i >= 0; i--){
            list1Number += ll1.get(i);
//            System.out.println(list1Number); //tester code
        }
        System.out.println("List One: " + list1Number);
        String list2Number = "";
        for (int i = ll2.size()-1; i >= 0; i--){
            list2Number += ll2.get(i);
//            System.out.println(list2Number); //tester code
        }
        System.out.println("List Two: "+list2Number);

        int int1 = Integer.parseInt(list1Number);
        int int2 = Integer.parseInt(list2Number);

        int summation = int1 + int2;

        System.out.println (int1 + " + " + int2 + " = "+summation);
        String sumString = Integer.toString(summation);

        //add the digits of this number to a LL
        LinkedList<Integer> summationList = new LinkedList<Integer>();
        while (summation > 0){
            summationList.add(summation % 10);
            summation = summation/10;
        }
        System.out.print("Summation List: "+llToString(summationList));
    }

    public static String llToString(LinkedList list){

        String output = "";
        for(int i = 0; i< list.size(); i++){
            if (i == list.size()-1){
                output+= list.get(i);
            }else {
                output += list.get(i) + "->";
            }
        }

        return output;
    }
}
