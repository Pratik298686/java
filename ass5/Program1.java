import java.util.Scanner;

/*1. Write a program which accept name from user and print that name.  
  Input : Piyush Khairnar    Output : Piyush Khairnar */
  class Program1{
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
          System.out.println("Enter The Name: ");
          String ch = sc.nextLine();
          System.out.println(ch);
      }
  }