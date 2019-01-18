import java.util.*;
class A
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double sal=sc.nextDouble();
		double tax=0;
		if(sal<=300000)
			tax=0.05*sal;
		else if(sal<=500000)
			tax=15000+0.1*(sal-300000);
		else
			tax=35000+0.15*(sal-500000);
		System.out.println("Computed Tax = "+tax);
	}
}