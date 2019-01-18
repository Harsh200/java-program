class Driver
{
public static void main(String args[])
{
Circle c1=new Circle();
c1.x=5;
c1.y=2;
c1.r=10;
double a=c1.calarea();
double b=c1.calcircumference();
System.out.println("radius="+c1.r+"cumference="+b);
System.out.println("radius="+c1.r+"area="+a);
c1.findposition(2,3);

Circle c2=new Circle();
c2.x=7;
c2.y=7;
c2.r=8;
a=c2.calarea();
b=c2.calcircumference();
System.out.println("radius="+c2.r+"cumference="+b);
System.out.println("radius="+c2.r+"area="+a);
}
}