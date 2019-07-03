import java.util.Scanner;
/*class Main{
	public static void main (String[] args){
	    // Type your code here
	}
}*/
public class Main {
	//private static Scanner sc;
	public static void main(String[] args) 
	{
		int Number, Temp, Reminder, Sum = 0, i, Factorial;
		Scanner sc = new Scanner(System.in);
		
		//System.out.print(" Please Enter any Number : ");
		Number = sc.nextInt();		
		
		for(Temp = Number; Temp > 0; Temp = Temp /10)
		{
			Factorial = 1; 
			
		    Reminder = Temp % 10;
		    for(i = 1; i <= Reminder; i++)
		    {
		     	Factorial = Factorial * i;
		    }
		   // System.out.println(" The Factorial of " + Reminder + "  =  " + Factorial);
		     Sum = Sum + Factorial;
		}
		
		//System.out.println(" The Sum of the Factorials of a Given Number " + Number + " =  " + Sum);
		
		if ( Number == Sum )
		{
			System.out.println("Yes" );
		}
		else
		{
		   System.out.println("No");
		}
	}
}