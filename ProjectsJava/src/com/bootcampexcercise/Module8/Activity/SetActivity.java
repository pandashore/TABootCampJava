package com.bootcampexcercise.Module8.Activity;

import java.util.Set;
import java.util.HashSet;

public class SetActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a set of names.

        HashSet names = new HashSet();

        //Also try adding a few duplicate entries to this set.


        //TODO: 2 - Call print method to print the set passed as its parameter.

        names.add("Jurga");
        names.add("MArtin");
        names.add("Glad");
        names.add("EUgene");
        System.out.println("Output : ");

        SetActivity nms = new SetActivity();
        nms.print(names);

    }

    void print(Set set) {
        //TODO: 3 - Type code to print this set
        //Notice the order in which elements get printed.
        for (Object nmsSet : set) {
            System.out.println(nmsSet.toString());

           ;
        }
    }

}
