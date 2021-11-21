import java.util.Scanner;
public class Pluperfet {
    
    static void isArmstrong(int n){
        int digit,sum,last,temp;
        digit=0;
        sum=0;
        last=0;
        temp=n;
        while(temp>0){
                temp=temp/10;
                digit+=1;
        }
        temp=n;
        while(temp>0){
            last=temp%10;
            sum+=Math.pow(last,digit);
            temp/=10;
        }    
        if(n==sum){
            System.out.println("Armstrong no.");
        }
        else{
            System.out.println("Not an Armstrong no.");
        }
            
        
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. : ");
        int n=sc.nextInt();
        isArmstrong(n);
    }
}
