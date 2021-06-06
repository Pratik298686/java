/*3. Write application which accept file name from user and read all data from that file
and display contents on screen.
Input : Demo.txt
Output : Display all data of file. */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.crypto.Data;
class Program3
{
    public static void main(String[] args) {
        try{
            File file = new File("Demofile.txt");
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine())
            {
                String Data = myReader.nextLine();
                System.out.println(Data);  
            }
            myReader.close();
          
            
        }
        catch(IOException e){
            System.out.println("An error occured"); 
            e.printStackTrace();
        }
    }
}