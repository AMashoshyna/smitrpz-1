package com.company;

import static com.company.NumberSorter.getNumberWithMaxCountOf1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result1 = getNumberWithMaxCountOf1(1);
        System.out.println(result1);
        int result2 = NumberSorter.getNumberWithMaxCountOf1(300);
        System.out.println(result2);

    }
}
