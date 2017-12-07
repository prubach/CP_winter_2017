package pl.waw.sgh;

import java.util.*;
import java.util.Arrays;

public class ListsAndSets {

    public static void printCollection(Collection collection) {
        for (Object setEl : collection) {
            System.out.println(setEl);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("abc");
        myList.add("cde");
        myList.add(0,"def");
        myList.add("def");

        System.out.println("2nd elem: " + myList.get(1));

        printCollection(myList);
        //Arrays.
        Collections.sort(myList);
        printCollection(myList);

        Set<Integer> mySet = new HashSet<>();
        mySet.add(343);
        mySet.add(123);
        mySet.add(778);
        mySet.add(123);

        printCollection(mySet);

        Set<Integer> mySortedSet = new TreeSet<>();
        mySortedSet.addAll(mySet);

        printCollection(mySortedSet);

    }
}
