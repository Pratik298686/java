/**/
import java.lang.*;
import java.util.Scanner;
class Program2
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
      //char ch1[] = str1.toCharArray();    
      
      int isize1 = ch1.length;
      int count = 0,i=0;
      
      int maxlength = Integer.MIN_VALUE;
      String large = " ";
      //char ch3[] = new char[isize1]; 
      while(i<isize1)
      {
          if(ch1[i] == ' ')
          {
            count++;
          }else if(ch1[i].length>maxlength)
          {
             large = ch1[i];
             maxlength = ch1[i].length; 
          }
          i++;
      }
      System.out.println(large);
      
    }
    
}