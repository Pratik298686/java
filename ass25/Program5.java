/*5. Accept division of student from user and depends on the division display exam timing. There are 4 divisions in school as A,B,C,D. Exam of division A at 7 AM, B at 8.30 AM, C at 9.20 AM and D at 10.30 AM. (Application should be case insensitive) 
Input :  C 
Output :  Your exam at 9.20 AM 
Input :  d 
Output :  Your exam at 10.30 AM */
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
      System.out.println("Enter character :");
      char n1 = sc1.next().charAt(0);
      char ch1 = 'A',ch2 = 'a';
     // boolean b1 = true;
      //boolean b2 = false;

      if(n1=='a')
      {
        System.out.println("Your exam at 9.00 AM");  
      }
      else if(n1=='b')
      {
        System.out.println("Your exam at 9.10 AM");  
      }
      else if(n1=='c')
      {
        System.out.println("Your exam at 9.20 AM");  
      }
      else if(n1=='d')
      {
        System.out.println("Your exam at 9.30 AM");  
      }
      
      
    }
}