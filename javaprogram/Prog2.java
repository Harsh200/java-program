class Prog2                                                             //shubhamsaraswat75@gmail.com
{
public static void main(String args[])
{
int i;
for(i=1;;i++)
        if(i%7==0&&i%6==1&&i%5==1&&i%4==1&&i%3==1&&i%2==1)
        break;
System.out.println(i);



int h,f,t,amt=3400;
t=amt/2000;
amt=amt%2000;
f=amt/500;
amt=amt%500;
h=amt/100;
System.out.println("Number of 2000 notes ="+t);
System.out.println("Number of 500 notes ="+f);
System.out.println("Number of 100 notes ="+h);
}
}