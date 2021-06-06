/*5. Accept string from user and check whether the string is palindrome or not without considering its case.   Input :   “1abccBA1” Output :   TRUE */
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
      String reverse = "";
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Enter first character :");
      String str1 = sc1.nextLine();
      String org = str1;
      //char ch1[] = str1.toCharArray();    
      
      int isize1 = org.length();
      //char ch3[] = new char[isize1]; 
      
      for(int i=isize1-1; i>=0; i--)
      {
        reverse = reverse + str1.charAt(i);
      }
      if(org.equals(reverse))
    {
        System.out.println("this is palindrome");  
    }
    else
    {
        System.out.println("this is NOT palindrome");
    }
    }
    
}