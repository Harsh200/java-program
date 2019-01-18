class G
{
	public static void main(String args[])
	{
		int n=5,c=0,i;
		for(i=0;i<n;i++)
		{
			if(n%2==0)
			{
				c++;
				n=n/2;
			}
		}
		System.out.println(c);
	}
}