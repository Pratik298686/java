import java.util.Scanner;

/*
 2.  Write a program which accept one number from user and check whether that number is greater than 100 or not.   Input : 101    Output : Greater  
  Input : 39    Output : Smaller
*/
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
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number :");
      int iNo = sc.nextInt();
      boolean b1 = true;
      boolean b2 = false;
      if(iNo>=100)
      {
        System.out.println(b1);
      }
      else{
        System.out.println(b2);   
      }   
    }
}