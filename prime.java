import java.util.*;
public class prime {
		

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check whether prime or not");
		int a;
		a=sc.nextInt();
		System.out.println("From github");
		int i=0,flag=0;
		for(i=2;i<=Math.sqrt(a);i++)
		{
			if(a%i==0)
			{
				flag=1;
			}
			
		}
		if(flag==1)
		{
			System.out.println("Not prime");
		}
		else
		{
			System.out.println("Prime");
		}
		// TODO Auto-generated method stub
		
	}

}
