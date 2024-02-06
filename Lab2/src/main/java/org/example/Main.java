package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new MyLinkedList<Integer>();
        intList.add (0);
        Integer x = intList.iterator().next();


    }
    void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

}