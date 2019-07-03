import java.util.*;
public class Main {

    public static void main(String[] args) {

     
       Scanner sc=new Scanner(System.in);
      int t1=0,t2=1;
     
            int n=sc.nextInt();
       System.out.println("Enter the limit for Fibonacci: "+n);
      if(n<=-1)
      {
        System.out.println("Exception occurred");
      }
      else
      {
      System.out.print("The Fibonacci series is :");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1+" ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
    }
}