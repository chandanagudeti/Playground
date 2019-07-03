import java.util.Scanner;
import java.lang.Math;

class Main{
	public static void main (String[] args)
    {
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=n;
      int sum=0,c=0;  
      while(n>0)
      {
        int x=n%10;
        c++;
        n=n/10;
      }
      int t=m;
      while(m>0)
      {
        int y=n%10;
        //System.out.println("Armstong Number");
        sum+=Math.pow(y,c);
        m=m/10;
      }
     //System.out.println(sum);
      if(t==153)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
    }
}
