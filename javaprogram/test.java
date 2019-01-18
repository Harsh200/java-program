class A{
 int main()
{
System.out.println("jjj");
System.out.println("heo");
}
}
class B extends A{
int main(int a)
{
System.out.println(a);
System.out.println("hello world");
}
}
class C{
public static void main(String args[])
{
B obj=new B();
obj.main();
obj.main(1);

System.out.println("wow you are fool");

}
}