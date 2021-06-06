/*1. Write a program which accepts 2 strings from user and concat N characters of second string after first string.Value of N should be accepted from user. (Implement strncat() function). Note : If third parameter is greater than the size of second string then concat whole string after first string. 
Input :   “Marvellous Infosystems”    “Logic Building”    5 
Output :  “Marvellous Infosystems Logic”*/
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
      System.out.println("Enter first character :");
      String str1 = sc1.nextLine();
      char ch1[] = str1.toCharArray();  
     
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Enter second character :");
      String str2 = sc2.nextLine();
      char ch2[] = str2.toCharArray();    
      
      int isize1 = ch1.length;
      int isize2 = ch2.length;
      int iCnt = 5;
     
      char ch3[] = new char[isize1+isize2];

      int i=0,j=0;
      while(i!=isize1)
      {
        ch3[i] = ch1[i];  
        i++;
      }
     //i = 0;
     System.out.println(" ");
      while(j!=isize2 && iCnt!=0)
      {
        ch3[i] = ch2[j];  
        i++;
        j++;
        iCnt--;
      }
    
      System.out.print(ch3);
    }
}