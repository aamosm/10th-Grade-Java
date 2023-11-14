import java.util.Scanner;

public class VowelUPCaseCounter{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        char a[]= new char[10];

        System.out.println("Input the characters : ");
        for (int w = 0;w<10;w++){

            a[w] = sc.next().charAt(0);

        }
        int up = 0;
        int vw= 0;

        for (int w = 0;w<10;w++){

            if(Character.isUpperCase(a[w])){
                up = up+1;
            }

        }

        for (int i = 0;i<10;i++){

            if(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'||a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'){
                vw = vw+1;
            }

        } 
        System.out.println("The number of vowels is "+vw);
        System.out.println("The number of capital letters is "+up);
    }
}

