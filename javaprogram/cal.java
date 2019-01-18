import java.util.*;
abstract class A{
int a,b;
abstract void rect(int c,int d);
}
class B extends A{
int e;
int f;
void rect(int aa,int bb){
int area=aa*bb;
System.out.println(area);
}
}
public class cal{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter two no");
int x=sc.nextInt();
int y=sc.nextInt();
A B=new B();
B.rect(x,y);
}
}
