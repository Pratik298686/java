/*4. Write a program which accept string from user and check whether it contains vowels in it or not. 
Input :   “marvellous” 
Output :   TRUE 
Input :   “Demo” 
Output :   TRUE 
Input :   “xyz” 
Output :   FALSE  */
import java.lang.*;
import java.util.Scanner;
class Program4
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
      int isum1 = 0;
      boolean b1 = true;
      boolean b2 = false;
      for(int i=0; i<ch.length; i++)
      {
          if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
          {
            System.out.println(b1); 
            break; 
          }
      }
      
    }
}