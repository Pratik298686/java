/*1.Write a program which accept string from user and copy the contents of that string into another string. (Implement strcpy() function)  */
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
      String str1 = sc1.nextLine();
      char ch1[] = str1.toCharArray();      
      int isize = ch1.length;
      char ch2[] = new char[isize];

      int i=0;
      while(i!=isize)
      {
          ch2[i] = ch1[i];
          i++;
      }
      System.out.println(ch2);
    }
}