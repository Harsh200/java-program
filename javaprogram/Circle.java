class Circle
{
double x,y,r;
double calcircumference()
{
return 2*3.14*r;
}//end of calcircumference()
double calarea()
{
return 3.14*r*r;
}//end of calarea()

void findposition(double x1, double y1)
{
double d=Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
if(d<r)
	System.out.println("inside");
else if(d==r)
	System.out.println("on the circle");
else
	System.out.println("outside");
}//end of findposition

}//end of class