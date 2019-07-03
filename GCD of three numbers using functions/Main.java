import java.util.*;
class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int min;
		min=Math.min(n1,n2);
		min=Math.min(min,n3);
		for (int i=min;i>=1;i--)
		{
		  if((n1%i==0)&&(n2%i==0)&&(n3%i==0))
		  {
		  System.out.println(i);
		  break;
		  }
		}
		
		
        
    }
}