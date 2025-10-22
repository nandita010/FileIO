package ie.atu.week3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class resourceFeattest {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the file name(e.g, student.txt): ");
        String fileName =sc.nextLine().trim();

        System.out.println("Enter a name to save: ");
        String name=sc.nextLine().trim();

        try(PrintWriter out= new PrintWriter(new FileWriter(fileName, true))) //try resource
        {
            //file would be created everytime this runs, no old stuff is saved without append mode.
            out.println(name);
            System.out.println("Saved to" + fileName);
            out.close(); //always close or info would not be saved
        }

        catch(IOException ex){
            System.out.println("Could not write this file: " +ex.getMessage());
        }

    }
}
