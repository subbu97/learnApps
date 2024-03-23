package org.example.linked;

import java.util.LinkedList;

public class Linked_Example {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");

        l_list.remove(3);

        l_list.remove("Pink");

        // print the list
        System.out.println("The linked list: " + l_list);
    }
}
