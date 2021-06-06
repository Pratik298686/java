/*5. Write application which accept file name from user and one string from user. Write
that string at the end of file.
Input : Demo.txt
 Hello World
Output : Write Hello World at the end of Demo.txt file */
import java.io.FileWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class Program5
{
    public static void main(String[] args) {
        String Program = "java string end of the file";
        try{
            FileWriter file = new FileWriter("Demofile.txt");
           // Scanner mywrite = new Scanner(file);
            file.write(Program);
            System.out.println("succesfully wrote the file"); 
            file.close();
           // System.out.println("succesfully wrote the file"); 
            
        }
        catch(IOException e){
            System.out.println("An error occured"); 
            e.printStackTrace();
        }
    }
}