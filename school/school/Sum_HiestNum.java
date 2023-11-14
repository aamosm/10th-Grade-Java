import java.util.Scanner;
public class Sum_HiestNUm{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Double a[]= new Double[10];

        System.out.println("Input the numbers : ");
        for (int w = 0;w<10;w++){

            a[w] = sc.nextDouble();

        }
        Double sum = 0d;
        Double most= 0d;

        
        for (int w = 0;w<10;w++){

            sum = sum + a[w];

        }
        for (int i = 0;i<10;i++){
            if (a[i]>most){
                most = a[i] ;
            }
        } 
        System.out.println("The sum is "+sum);
        System.out.println("The highest number is "+most);

    }
}
