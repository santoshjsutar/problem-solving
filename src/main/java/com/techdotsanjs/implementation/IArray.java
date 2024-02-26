package com.techdotsanjs.implementation;

import java.util.Arrays;

public class IArray {
    private int current;
    private final int[] data;

    public IArray(int size) {
        current = 0;
        data = new int[size];
    }

    public IArray(int[] data) {
        current = data.length;
        System.out.println(current);
        this.data = data;
    }

    public Integer get(int index) {
        if (index > current - 1) {
            return null;
        }
        return data[index];
    }

    public IArray push(int value) {
        data[current] = value;
        current++;
        return this;
    }

    public void pop() {
        current--;
    }

    public int size() {
        return current;
    }

    public boolean has(int value) {
        for (int i = 0; i < current; i++) {
            System.out.println("inside for: " + i);
            if (value == get(i)) {
                System.out.println("inside if: " + i);
                return true;
            }
        }
        System.out.println("outside for");
        return false;
    }

    private int[] print(int[] data) {
        int[] elements = new int[current];
        for (int i = 0; i < current; i++) {
            elements[i] = data[i];
        }
        return elements;
    }


    @Override
    public String toString() {
        return "IArray{ " +
                "current=" +
                current +
                ", data=" +
                Arrays.toString(print(data)) +
                " }";
    }

    public static void main(String[] args) {
        IArray iArray = new IArray(10);
        iArray.push(10);
        iArray.push(20);
        iArray.push(30);
        iArray.push(40);
        iArray.pop();
        iArray.push(50);
        System.out.println(iArray);
        System.out.println(iArray.get(0));
    }


}
