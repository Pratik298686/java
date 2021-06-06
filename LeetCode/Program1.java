/*Write a Program that output the string representation of nos form 1ton.
but for multiples of three it should output "FIZZ" instead of the number and for the multiples 
of five output "BUZZ" for nos which are multiples of both three and five output "FIZZBUZZ"*/
import java.lang.*;
import java.util.Scanner;
class Program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Get The Number :");
        int iNo = sc.nextInt();
        for(int i=0; i<=iNo; i++){
          if(i%3==0){
              System.out.println("FIZZ");
          }
          else if(i%5==0){
              System.out.println("BUZZ");
          }
          else if(i%3==0 && i%5==0){
              System.out.println("FIZZBUZZ");
          }
        }
    }
} 