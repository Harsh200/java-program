import java.util.*;
public class Prime{
public static void main(String args[])
{
int c=0;
Scanner sc= new Scanner(System.in);
System.out.println("enter a no");
int a =sc.nextInt();
for ( int i=2;i<=a;i++)
{
if(a%i==0)
{
c++;
}

}
if(c==1)
{
System.out.println("prime");
}
else
{
System.out.println("not prime");
}
}
}