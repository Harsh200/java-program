import java.util.*;
class C
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int val=sc.nextInt();
		System.out.println(method(val));
	}
	public static long method(int n)
	{
	if(n==0)
	return 1;
	return n*method(n-1);
	}
}