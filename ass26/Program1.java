/*2. Accept character from user. If character is small display its corresponding capital character, and if it small then display its corresponding capital. In other cases display as it is. 
Input :  Q 
Output : q 
Input :  m 
Output : M 
Input :  4 
Output : 4   Input :  % 
Output : %*/
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
      char n1 = sc1.next().charAt(0);
     // char ch1 = 'A',ch2 = 'a';
     
      if(n1>='A' && n1<='Z')
      {
        n1 = (char)(n1+32);
        System.out.println(n1);  
      }
      else if(n1>='a' && n1<='z')
      {
        n1 = (char)(n1-32);
        System.out.println(n1);  
      }
      
      
    }
}