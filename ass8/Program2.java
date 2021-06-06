/*2. Accept single digit number from user and print it into word.  
Input : 9  Output : Nine 
Input : -3 Output : Three  
Input : 12 Output : Invalid Number  */
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
      Scanner sc1 = new Scanner(System.in);
      System.out.println("obtained marks :");
      int iNo1 = sc1.nextInt();
      
      switch(iNo1)
      {
          case 1:
          System.out.println("first");
          break;
          case 2:
          System.out.println("second");
          break;
          case 3:
          System.out.println("third");
          break;
          case 4:
          System.out.println("four");
          break;
          case 5:
          System.out.println("five");
          break;
          case 6:
          System.out.println("six");
          break;
          case 7:
          System.out.println("seven");
          break;
          case 8:
          System.out.println("eight");
          break;
          case 9:
          System.out.println("Nine");
          break;
          default:
          System.out.println("invalid number");
          break;

      }
    }
}