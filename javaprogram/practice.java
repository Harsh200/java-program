import java.util.*;
class A{
int a;
int b;
A(int c,int d){
this.a=c;
this.b=d;
}
void rect()
{
int area=a*b;
System.out.println("area is "+area);
}
void cuboid(int h)
{
int vol=a*b*h;
System.out.println("vol is"+vol);
}
}
public class practice{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter length,breadth,height");
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
A obj=new A(x,y);
obj.rect();
obj.cuboid(z);
}
}

