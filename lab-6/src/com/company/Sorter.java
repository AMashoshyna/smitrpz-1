package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Sorter {
    public static ArrayList<Integer> sortItems(ArrayList<Integer> input) {
        ArrayList<SortableItem> PreparedData = new ArrayList<>(input.size());
        for (int i = 0; i < input.size(); i++) {
            PreparedData.add(new SortableItem(input.get(i)));
        }
        Collections.sort(PreparedData);

        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < PreparedData.size(); i++) {
            result.add(PreparedData.get(i).getRawValue());
        }
        return result;

    }
}
