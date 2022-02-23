package Assignment2;

/*
    CSC 241 Spring 2022
    Assignment 2
    Name:
    ID:
 */

import java.io.FileNotFoundException;
import java.util.Scanner;

public class GradeManager {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Course Code: ");
        String courseCode = scan.next();
        Course course = new Section();
        course.seeData();
        System.out.println(course.showCourseInfo());

    }

}
