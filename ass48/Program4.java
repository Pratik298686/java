/*4. Write application which accept file name from user and display size of file.
Input : Demo.txt
Output : File size is 56 bytes */
import java.io.File;
import java.io.IOException;//
import java.util.Scanner;

class Program4
{
    public static void main(String[] args) {
        
            File file = new File("Demofile.txt");
            long filesize = file.length();
            System.out.println("The Size of file:"+filesize);    
        
    }
}