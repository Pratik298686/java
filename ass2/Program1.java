/*
 Accept one number from user and print that number of * on screen
*/
import java.lang.*;
import java.util.*;
class Numbers
{
    void EvenFactorial(int iNo)
    {
       int i = 0;
       for(i=0; i<iNo; i++)throw Exception;
       {
        System.out.println(" * ");
       }
    }
}
class Demo12 
{
  public static void main(String arg[])
  {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the number");
      int value = sobj.nextInt();

      Numbers nobj = new Numbers();
      nobj.EvenFactorial(value);
    

  }  
}