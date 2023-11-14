import java.util.Scanner;

public class pal{
    public static void main(String args[]){
        
        Scanner scn = new Scanner(System.in);
        
        int i;
        System.out.println("Enter String : ");
        String a = scn.next();
        String k = "";
        char c; 
        for (i=a.length()-1;i>=0;i--){
        
         c = a.charAt(i);   
            k = k + c;
        
        }
     System.out.println("New Word:"+k);
        if (k.equals(a))
            System.out.println("Is a palendrome\n");
        else
            System.out.println("No\n");

    }
}
