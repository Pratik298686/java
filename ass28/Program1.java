/**/
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
      char ch[] = str.toCharArray();
      //int isum1 = 0;     
      for(char i=0; i<ch.length; i++)
      {
        if(ch[i]>='A' && ch[i]<='Z')
        {
            ch[i] = ch[i]+32;
            System.out.print(ch[i]);  
        }
        else{
            System.out.print(ch[i]);  
        }
      }

    }
}