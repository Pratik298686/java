/*1. Write application which accept file name from user and open that file in read mode.
Input : Demo.txt
Output : File opened successfully. */
import java.io.File;
import java.io.IOException;
class Program1
{
    public static void main(String[] args) {
        try{
            File file = new File("Demofile.txt");
           if(file.createNewFile())
           {
               System.out.println("file created :"+file.getName());
           }
           else{
            System.out.println("file is already exit"); 
           }
            
        }
        catch(IOException e){
            System.out.println("An error occured"); 
            e.printStackTrace();
        }
    }
}i
