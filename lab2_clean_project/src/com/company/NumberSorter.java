package com.company;

import java.util.ArrayList;



    public class NumberSorter {

        public static boolean isPrime(int n) {
            for(int i=2;i<n;i++) {
                if(n%i==0)
                    return false;
            }
            return (n > 1);
        }

        public static ArrayList<Integer> convertToBinary(int no){
            ArrayList<Integer> container = new ArrayList<Integer>();

            int i = 0;
            while (no > 0){
                container.add(no%2);
                i++;
                no = no/2;
            }

            return container;
        }

        public static java.lang.Integer getNumberWithMaxCountOf1(int n) {

            ArrayList<Integer> allPrimeNumbersUnderN = new ArrayList(n);

            for (int i = 0; i < n; i++) {
                if(isPrime(i)) {
                    allPrimeNumbersUnderN.add(i);
                }

            }
            System.out.println(allPrimeNumbersUnderN.toString());
            if (allPrimeNumbersUnderN.size() < 1) {
                return -1;
            }
            int currentMax = 0;
            int maxItemIndex = 0;

            for(int j = 0; j < allPrimeNumbersUnderN.size(); j++) {
                ArrayList<Integer> next = convertToBinary(allPrimeNumbersUnderN.get(j));
                int count =0;
                for(int k = 0; k < next.size(); k++) {
                    int current = next.get(k);
                    if (current == 1) {
                        count++;
                    }
                }
                if(count > currentMax) {
                    currentMax = count;
                    maxItemIndex = j;
                }
            }

            return allPrimeNumbersUnderN.get(maxItemIndex);
        }
    }



