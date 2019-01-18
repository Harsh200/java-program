import java.util.*;
public class Replacevulgarword {
    public static void main(String args[]){
        String[] b = new String[5];
        Scanner sc= new Scanner(System.in);
        String[] a= {"cat","dog","elephant"};
        int size = a.length;
        System.out.println(size);
        System.out.println("enter paragraph- \n");
        String para = sc.nextLine();
        for(int i=0; i<size;i++)
        {
             b[i]= sc.nextLine();
        }
        for (int i=0; i<size;i++)
        {
            if(b[i].equalsIgnoreCase(a[0]))
            {
                b[i] = "***";
            }
            if(b[i].equalsIgnoreCase(a[1]))
            {
                b[i] = "***";
            }
            if(b[i].equalsIgnoreCase(a[2]))
            {
                b[i] = "********";
            }
        }
        System.out.println();

    }
}
