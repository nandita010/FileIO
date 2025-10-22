package ie.atu.week3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadExample {

    public static void main(String[] args) {
    showFile();
    }
    static void showFile(){
        BufferedReader br = null;
        try {
            FileReader neverUsed = new FileReader("students.txt");
            br = new BufferedReader(neverUsed);
            System.out.println("Contents of students.txt: ");

            String line;
            while((line= br.readLine()) != null){
                System.out.println(" - " + line);
            }

        } catch (Exception ex) {
            System.out.println("Could not read file: "+ ex.getMessage());
        }
        finally {
            if(br != null){
                try{
                    br.close();
                }
                catch(IOException closeEx){
                    System.out.println("Could not close file: "+ closeEx.getMessage());
                }
            }
        }

    }
}
