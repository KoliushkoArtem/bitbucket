package com.neven.my_custom_array;

import java.util.ArrayList;

public class MyCustomCollection extends ArrayList<Integer> {

    ArrayList<Integer> myCustomCollection;

    public MyCustomCollection() {
        this.myCustomCollection = new ArrayList<Integer>();
    }

    @Override
    public boolean add(Integer integer) {
        for (int i = 0; i < this.size(); i++) {
            this.set(i, this.get(i) + integer);
        }
        return super.add(integer);
    }

    @Override
    public Integer remove(int integer) {
        int index;
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).equals(integer)) {
                for (int b = 0; b < this.size(); b++) {
                    this.set(b, this.get(b) - integer);
                }
                index = i;
                return super.remove(index);
            }
        }
        return -1;
    }

    public boolean findByMeaning(Integer meaning) {
        for (Integer integer : this) {
            if (integer.equals(meaning)) {
                return true;
            }
        }
        return false;
    }

    public Integer findByIndex(Integer index) {
        if (index < this.size()) {
            return this.get(index);
        }
        return 0;
    }

    public Integer findMaxElement() {
        int maxElement = 0;
        for (int integer : this) {
            if (maxElement < integer) {
                maxElement = integer;
            }
        }
        return maxElement;
    }

    public Integer findMinElement() {
        int minElement = 0;
        for (int integer : this) {
            if (minElement > integer) {
                minElement = integer;
            }
        }
        return minElement;
    }

    public Integer findMeanMeaning() {
        int counter = 0;
        int mean = 0;
        for (int integer : this) {
            mean += integer;
            counter++;
        }
        mean = mean / counter;
        return mean;
    }
}
