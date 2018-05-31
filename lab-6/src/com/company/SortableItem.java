package com.company;

public class SortableItem implements Comparable<SortableItem> {
    private int RawNumber;
    private int SumOfDigits;

    SortableItem(int RawNumber) {
        this.RawNumber = RawNumber;

        this.SumOfDigits = sumDigits(RawNumber);

    }

    public static int sumDigits(int rawNumber) {
        char[] charRepresentation = String.valueOf(rawNumber).toCharArray();
        int result = 0;
        for (int i = 0; i < charRepresentation.length; i++) {
            result = result + (charRepresentation[i] - '0');
        }
        return result;
    }
    public int getRawValue() {
        return this.RawNumber;
    }

    @Override
    public int compareTo(SortableItem o) {
        return this.SumOfDigits - o.SumOfDigits;
    }
}
