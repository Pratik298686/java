/*1.Write a program which accept string from user and accept one character. Check whether that character is present in string or not. 
Input :   “Marvellous Multi OS”    e 
Output :   TRUE 
Input :   “Marvellous Multi OS”    W 
Output :   FALSE*/
import java.lang.*;
import java.util.Scanner;
class Program1
{
   public static void main(String[] args) {
       Base bobj = new Base();
       bobj.fun();
    
   }
}
class Base
{
    public void fun()
    {
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Enter character :");
      String str = sc1.nextLine();
      char ch1[] = str.toCharArray();
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Enter another character :");
      char ch2 = sc2.next().charAt(0);
      
      //int isum1 = 0;
      boolean b1 = true;
      boolean b2 = false;

      for(char i=0; i<ch1.length; i++)
      {
        if(ch1[i]==ch2)
        {
            System.out.println(b1);
            break;    
        }
        
      }

    }
}