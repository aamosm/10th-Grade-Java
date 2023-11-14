import java.util.*;
public class LinearSearch
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i;
        String a[] = new String[10];
        for(i=0;i<10;i++)
        {
            System.out.println("Enter value "+(i+1));
            a[i] = in.next();
        }
        System.out.println("Enter a key");
        String k = in.next();
        int s = 0;
        for(i=0;i<10;i++)
        {
            if(k.equals(a[i]))
            {
                s=i+1;
                break;
            }
        }
        if(s>0)
        {
            System.out.println("Found at position "+(i+1));
        }
        else
        System.out.println("NOT FOUND");
    }
}
