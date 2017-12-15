package pl.waw.sgh.showing_overload;

import java.util.*;

public class ListsAndSets {

    static public void printCollection (Collection collection){

        for (Object setEl: collection

             ) {
            System.out.println(setEl);

        }
    }

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();  //<String> in earlier versions of java
        myList.add("abd");
        myList.add("cde");
        myList.add(0, "def");
        myList.add("def");


        System.out.println("2nd element: "  + myList.get(1));

        printCollection(myList);  //sorting
        Collections.sort(myList);
        printCollection(myList);



        for (String el:myList
             ) {
            System.out.println(el);
        }

        Set<Integer> mySet = new HashSet<>();
        mySet.add(343);
        mySet.add(123);
        mySet.add(778);
        mySet.add(123);  //duplicate in set will be ignored

        for (Integer setEl:mySet
             ) {
            System.out.println(setEl);
        }

        Set <Integer> mySortedSet = new TreeSet<>();
        mySortedSet.addAll(mySet);




        printCollection(mySortedSet);




    }
}
