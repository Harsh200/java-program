 class  Number_Objects
{
    static int count=0;
    Number_Objects(){
    
        count++;
System.out.println("i am object :"+count);

    }
}
public class B{
    public static void main(String[] args) 
    {
        Number_Objects obj1 = new Number_Objects();
        Number_Objects obj2 = new Number_Objects();
        Number_Objects obj3 = new Number_Objects();
        Number_Objects obj4 = new Number_Objects();
       
    }
}