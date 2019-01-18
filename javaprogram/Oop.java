import java.util.*;
class Oop{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int x[]=new int[5];
int n;
System.out.println("enter no of element");
n=sc.nextInt();
System.out.println("enter no of element");
try{
for(int i=0;i<n;i++)
x[i]=sc.nextInt();
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("maximum five elements are allow only");
n=5;
}
System.out.println(" you have entered");
for(int i=0;i<n;i++)
System.out.println(x[i]);
}
}
