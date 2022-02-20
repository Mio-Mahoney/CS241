package Assignment1;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/*
    CSC 241 Spring 2022
    Assignment 1
    Name: Mio
    ID: 806060967
 */



public class GradeManager {
    public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a Students Name: ");
    String querry = scan.nextLine();
    System.out.println(readResults(sSearch(querry)));

    System.out.println("Would you like to edit or quit? (edit | quit)");
    if (scan.nextLine().equalsIgnoreCase("edit")) {
        System.out.println("What would you  like to edit? (Ex: 'ID', 'Q3')");
        String gradeID = scan.nextLine();
        System.out.println("New Value:");
        String field = scan.nextLine();

        editGrade(sSearch(querry), gradeID, field);
    } else if (scan.nextLine().equalsIgnoreCase("quit")) {
        java.lang.System.exit(0);
    }
    }
    public static void editGrade(File input, String fieldID, String entry) throws IOException {

        Scanner line = new Scanner(input);
        String[] data = line.nextLine().split(",");

        FileOutputStream fileOutputStream = new FileOutputStream(input);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        if (fieldID.equalsIgnoreCase("id")) {
            data[1] = entry;
        } else if(fieldID.equalsIgnoreCase("q1")) {
            data[2] = entry;
        } else if (fieldID.equalsIgnoreCase("q2")) {
            data[3] = entry ;
        } else if (fieldID.equalsIgnoreCase("q3")) {
            data[4] = entry;
        } else if (fieldID.equalsIgnoreCase("midterm")) {
            data[5] = entry;
        } else if (fieldID.equalsIgnoreCase("final")) {
            data[6] = entry;
        } else {
            System.out.println("not an option sorry...");}

        bufferedWriter.write(Arrays.toString(data).substring(1, Arrays.toString(data).length()-1).replace(" ", ""));
        bufferedWriter.close();
        System.out.println(readResults(input));
    }
    public static File sSearch(String sName) throws Exception {
        if (sName.equalsIgnoreCase("quit")) {
            java.lang.System.exit(0);
        }
        Path p = Paths.get(System.getProperty("user.dir"),"src","Assignment1", sName + ".txt");
        File input = new File(p.toString());
        return input;
    }

    public static String readResults(File input) throws FileNotFoundException {
        Scanner line = new Scanner(input);
        String[] output = line.nextLine().split(",");

        String menu = "Name: " + output[0] + "  |  ID: " + output[1] + "  |  Q1: " + output[2] + "  |  " + "Q2: " + output[3] + "  |  " + "Q3: " + output[4] + "  |  Midterm: " + output[5] + "  |  Final: " + output[6];
        return menu;
    }

}
