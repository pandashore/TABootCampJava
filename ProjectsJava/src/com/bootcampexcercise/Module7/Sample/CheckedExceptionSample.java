package com.bootcampexcercise.Module7.Sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionSample {

    public static void main(String arg[]) {

        String fileName = "M4 - OO Principles.pptx";
//        String fileName = "Presentations/M4 - OO Principles.pptx";

        //The following class is used to open a file for reading
        FileReader reader;
        try {
            //The following line must be written in a try catch block
            //else it would not compile since
            //FilenotFoundException is a checked exception.
            //1 - Instantiate reader and pass fileName as a parameter
            reader = new FileReader(fileName);
            //2 - catch FileNotFoundException
        } catch (FileNotFoundException f){
            System.out.println("Please give correct path of file");
        }

    }
}
