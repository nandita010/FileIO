package ie.atu.week3;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteOnce {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the name of the file (e.g., students.txt): ");
        String fileName =sc.nextLine().trim();

        System.out.println("Enter a name to save: ");
        String name=sc.nextLine().trim();

        try(PrintWriter out = new PrintWriter(new FileWriter(fileName, true)))
        {
            out.println(name);
            System.out.println("Saved to "  + fileName);
            out.close();
        }
        catch(IOException e)
        {
            System.out.println("Could not write to file: " + fileName);
        }
    }
}
