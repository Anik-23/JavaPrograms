import java.util.Scanner;
public class TechNum {
    
    static void isTechNum(int n){
        int count=0;
        int temp=n;
        int sum=0;
        int square=1;
        while(temp>0){
        
            count++;
            temp/=10;
        }
        
        if(count%2!=0){
            System.out.println("Not a Tech number");
        }
        else{
            temp=n;
            int D= (int) Math.pow(10,count/2);
            int firstHalf=temp/D;
            temp=n;
            int secondHalf=temp%D;
            sum=firstHalf+secondHalf;
            square=sum*sum;
            
            if(square==n){
            
                System.out.println("Tech number");
            }
            else System.out.println("Not a tech number");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isTechNum(n);
        
    }
}
