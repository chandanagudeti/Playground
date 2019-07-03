import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int c=0;
      while(n>0)
      {
       int x=n%10;
        c=c+x;
        n=n/10;
      }
      System.out.println(c);
	}
}