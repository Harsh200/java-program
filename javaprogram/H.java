import java.util.*;
class H
{
	public static void main(String args[])
	{
		int n=0,r;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no");
		int a=s.nextInt();
		while(a>0)
		{
			r=a%10;
			a=a/10;
			if(r%2==0)
			{
				n++;
			}
		}
		System.out.println(n);
	}
}