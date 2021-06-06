/*3.Write a program which accept string from user and accept one character. Return index of first occurrence of that character. 
Input :   “Marvellous Multi OS”    M 
Output :   0
Input :   “Marvellous Multi OS”    W 
Output :   -1 
Input :   “Marvellous Multi OS”    e 
Output :   4*/
import java.lang.*;
import java.util.Scanner;
class Program3
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

      for(int i=0; i<ch1.length; i++)
      {
        if(ch1[i]==ch2)
        {
            System.out.println(i);
            break;    
        }
        
      }

    }
}