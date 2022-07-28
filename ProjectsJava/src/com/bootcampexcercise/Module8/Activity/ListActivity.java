package com.bootcampexcercise.Module8.Activity;

import com.bootcampexcercise.Module8.Sample.ListSample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a list of names. Use ArrayList.
        List list = new ArrayList();

        list.add("A");
        System.out.println("1st ele of List " + list.get(0));

        list.add(0, "b");
        System.out.println("2nd ele of List " + list.get(0));

        int size = list.size();

        Object element = list.get(list.size() - 1);
        System.out.println("Hello " + element.toString());
        element = list.get(0);


        boolean booleanVar = list.remove("B");
        booleanVar = list.remove ("B"); // true
        System.out.println(list.get(0));              // false

        // Remove the element at a particular index
        element = list.remove(0);

        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        ListActivity obj = new ListActivity();
        obj.print(list);

        //TODO: 2 - Call print method to print the list passed as its parameter.

    }


    void print(List list)
    {
        //TODO: 3 - Type code to print this list
        //Notice the order in which elements get printed.

        System.out.println("*** The rest of the list ***");
        for (Object nameOfMyObject : list) {
            System.out.println(nameOfMyObject.toString());
        }

    }


}
