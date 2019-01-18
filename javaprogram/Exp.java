import java.util.*;
class Exp{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
try{
System.out.println("enter two no");
int a=sc.nextInt();
int b=sc.nextInt();

int c=a/b;
System.out.println(c);
}
catch(InputMismatchException e)
{
System.out.println("only members are accepted");
}
catch(Exception e)
{
System.out.println("denominator cannot be zero");
}
}
}