package ie.atu.week3;

import java.util.Scanner;

public class Tryfile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age=0;
        while(true) { //loop until user input correct age and not text
            System.out.println("Enter age: ");
            String text = sc.nextLine().trim();
            try {
                age = Integer.parseInt(text);
                System.out.println("Thanks! You entered age= " + age);

            } catch (NumberFormatException e) {
                System.out.println("Invalid output: " + e.getMessage()); //message is to show what exactly happened
            }
        }

    }
}
