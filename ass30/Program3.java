
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
      String str1 = sc1.nextLine();
      char ch1[] = str1.toCharArray();  
      int isize = ch1.length;
      //char ch2[] = new char[isize];

      int i=0,iCnt=10;
      while((i!=isize))
      {
          if(ch1[i]>='A' && ch1[i]<='Z')
          {
            System.out.print(ch1[i]);  
          }
          i++;
      }
    }
}