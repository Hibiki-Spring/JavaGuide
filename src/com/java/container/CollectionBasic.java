package com.java.container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionBasic {
    public static void main(String[] args) {
        listSort();
        arraySort();
    }

    public static void listSort(){
        List list = new ArrayList();
        list.add(1);
        list.add(9);
        list.add(0);
        list.add(4);
        Collections.sort(list);
        list.stream().forEach(System.out::print);//0149
    }

    public static void arraySort(){
        int[] array = new int[]{1,9,0,4};
        Arrays.sort(array);
        System.out.println(array);
    }
}
