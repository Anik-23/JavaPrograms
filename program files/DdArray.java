
import java.util.Scanner;

public class DdArray {

    static void  differenceofSum(int n, int m){
        int sumn=0;
        int summ=0;
        for(int i=1;i<=n;i++){
            if(i%6==0){
                summ+=i;
            }
            else{
                sumn+=i;
            }
            
        }
        System.out.print(sumn-summ);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        differenceofSum(n,m);
        
    }
}