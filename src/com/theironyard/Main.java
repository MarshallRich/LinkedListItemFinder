package com.theironyard;

import java.util.LinkedList;

public class Main {

    public static Object ListChecker(LinkedList list){

        //creating counter
        int i = 0;

        //creating a loop to crawl through each item and get the size
        for (Object item : list) {
            i++;
        }

        return(list.get(i - 6));
    }

    public static void main(String[] args) {

        //constructing a list
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        Object value = ListChecker(list);

        System.out.printf("The fifth item from the end of the list is %s.\n", value.toString());
    }
}
