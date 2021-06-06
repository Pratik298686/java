/*2. Write Java program which accept String from user and display
below pattern.
Input : Hello
Output : H e l l o
 H e l l *
 H e l * *
 H e * * *
 H * * * * 
 */
 import java.lang.*;
import java.util.Scanner;
class Program2
{
   public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    /*System.out.println("Enter row number :");
    int irow = sc1.nextInt(); 
    System.out.println("Enter column number :");
    int icol= sc1.nextInt();*/
    
    System.out.println("Enter string :");
    String str = sc1.nextLine();
    char ch[]  = str.toCharArray();
    int isize = ch.length;
    
    System.out.println("Enter input :");
    for(int i=0; i<5; i++)
    {
        for(int j=0; j<isize; j++)
        {
            if(i+j<=4)
            {
                System.out.print(ch[j]);
               // isize++;
            }
            else 
            {
                System.out.print("*");
            }
            //++ch;
        }
        System.out.println("");
    //isize = ch.length;
    }
   
   }
}