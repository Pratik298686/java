import java.lang.*;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Display The Number :");
        int n = sc.nextInt();
        boolean b1 = true;
        boolean b2 = false;
        
        if(n<0 || (n%10==0 && n!=0)){
            System.out.println(b2);
        }
        int reversedNum = 0;
        while(n>reversedNum){
            int pop = n%10;
            reversedNum = reversedNum*10+pop;
            n = n/10;
        }

        if(n==reversedNum || n==reversedNum/10){
            System.out.println(b1);
        }
        else{
            System.out.println(b2);
        }
    }
}
