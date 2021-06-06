/*5. Write a program which 2 strings from user and concat second string after first string. (Implement strcat() function). 
Input :   Marvellous Infosystems    Logic Building 
Output :  Marvellous Infosystems Logic Building*/
import java.lang.*;
import java.util.Scanner;
class Program5
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
      System.out.println("Enter first character :");
      String str1 = sc1.nextLine();
      char ch1[] = str1.toCharArray();  
     
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Enter second character :");
      String str2 = sc2.nextLine();
      char ch2[] = str2.toCharArray();    
      
      int isize1 = ch1.length;
      int isize2 = ch2.length;
     
      char ch3[] = new char[isize1+isize2];

      int i=0,j=0;
      while(i!=isize1)
      {
        ch3[i] = ch1[i];  
        i++;
      }
     //i = 0;
     System.out.println(" ");
      while(j!=isize2)
      {
        ch3[i] = ch2[j];  
        i++;
        j++;
      }
    
      System.out.print(ch3);
    }
}