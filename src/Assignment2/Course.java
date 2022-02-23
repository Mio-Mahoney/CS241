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
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.sql.Time;
import java.util.Scanner;

abstract class Course {
    String name;            // course name (e.g., Programming Methodology)
    String crn;             // course crn (e.g., 14607)
    String code;            // course code (cs241)


    public void getCode(String code) {
        this.code = code;
    }
    public String[] seeData() {
        return data;
    }
    public String showCourseInfo() {
        return ("Name: " + data[0] + "  |  CRN: " + data[1] + "  |  Capacity: " + data[2] + "  |  " + "Code: " + data[3] + "  |  " + "Time: " + data[4] + "  |  Number of Secitons: " + data[5]);
    }
    // more variables may be added
    Path p = Paths.get(System.getProperty("user.dir"),"src","Assignment2", "data", "cs241" + ".txt");

    File file = new File(p.toString());
    Scanner scan = new Scanner(file);
    String[] data = new String[6];
    // complete the class as described in assignment2.pdf
    Course() throws FileNotFoundException {
        int i = 0;
        while(scan.hasNext()) {
            String line = scan.nextLine();
            data[i] = line.substring(line.indexOf(":")+1);
            i++;
        }
//        this.name = data[0];
//        this.crn = data[1];
//        this.code = data[5];
    }



}

class Section extends Course {
    int capacity;           // maximum number of students
    int curEnrol;           // current number of students who enrolled
    Time time;

    // more variables may be added

    // complete the class as described in assignment2.pdf


    //Create Student objects

    Section () throws FileNotFoundException {
//        this.capacity = Integer.getInteger(data[4]);
//        this.curEnrol = Integer.getInteger(data[5]);
//        this.time = Time.valueOf(data[6]);
    }
}