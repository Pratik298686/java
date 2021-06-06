import java.lang.*;
import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Display The Number :");
        int n = sc.nextInt();
        int count=0;
        while(n>0){
            n=n/5;
            count+=n;
        }
        System.out.println(count);
    }
}
