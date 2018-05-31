package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Sorter mySorter = new Sorter();
        ArrayList<Integer> myList = new ArrayList<Integer>(Arrays.asList(23, 111, 1001, 24));
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i).toString());
        }
        System.out.println();
        ArrayList<Integer> SortedList = Sorter.sortItems(myList);
        for (int i = 0; i < SortedList.size(); i++) {
            System.out.print(SortedList.get(i).toString());
        }

    }
}
