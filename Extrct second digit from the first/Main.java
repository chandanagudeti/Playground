import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int c=0;
      int m=n;
      while(n>0)
      {
       int x=n%10;
        c++;
        n=n/10;
      }
      //System.out.println(c);
      int a=1;
      while(c>0)
      {
         a=a*10;
        c--;
      }
      a=a/100;
      //System.out.println(a);
      int y=m/a;
      int g=y%10;
      System.out.println(g);
      
	}
}