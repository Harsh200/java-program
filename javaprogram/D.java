import java.util.*;
class D
{
	public static int method(int dividend, int divisor)
	{
		if(divisor==0)
			return dividend;
		return method(divisor, dividend%divisor);
	}
	public static void main(String args[])
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter two no.");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Resul Of "+ a +"And" + b +"Is" + method(a,b));
	}
}