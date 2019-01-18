import java.util.*;
interface A{

void hello(int a,int b,int c);
}
class B implements A{
public void hello(int e,int f,int g){
int vol=e*f*g;
System.out.println("vol is "+vol);
}
}
public class Interf{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter dimension");
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
B obj = new B();
obj.hello(x,y,z);
}
}