package Assignment2;

/*
    CSC 241 Spring 2022
    Assignment 2
    Name:
    ID:
 */

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.sql.Time;
import java.util.Scanner;

abstract class Course {
    String name;            // course name (e.g., Programming Methodology)
    String crn;             // course crn (e.g., 14607)
    String code;            // course code (cs241)

    // more variables may be added
    File file = new File("C:\\Users\\max76\\IdeaProjects\\Cs 241\\src\\Assignment2\\data\\cs241.txt");
    Scanner scan = new Scanner(file);
    String[] data = new String[5];
    // complete the class as described in assignment2.pdf
    Course() throws FileNotFoundException {
        int i = 0;
        while(scan.hasNext()) {
            String line = scan.nextLine();
            data[i] = line.split(":")[1];
        }
        this.name = data[0];
        this.crn = data[1];
        this.code = data[5];
    }

}

class Section extends Course {
    int capacity;           // maximum number of students
    int curEnrol;           // current number of students who enrolled
    Time time;

    // more variables may be added

    // complete the class as described in assignment2.pdf
    Section (String[] data, int capacity) throws FileNotFoundException {
        this.capacity = Integer.getInteger(data[4]);
        this.curEnrol = Integer.getInteger(data[5]);
        this.time = Time.valueOf(data[6]);
    }
}