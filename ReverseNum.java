import java.util.Scanner;

public class ReverseNum {

    static void reverse(int num){
    
        int rev=0,r,n=num;
        while(n!=0){
        r=n%10;
        rev=rev*10 + r; 
        n=n/10;
        }
        System.out.println("Reverse of the number is: "+rev);
        
       
    
    }
    
    static void reverseByRecurrence(int num){
    
        int rev;
        if(num<10){
        
            System.out.println(num);
            return;
        }
        else{
        
            System.out.print(num%10);
            reverseByRecurrence(num/10);
        }
    
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. to be reverse: ");
        int num = sc.nextInt();
        reverse(num);
        reverseByRecurrence(num);
    }
        
}
