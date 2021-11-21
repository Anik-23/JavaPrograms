import java.util.Scanner;
public class Prime {
    static boolean isPrime(int num){

        if(num==0 || num==1){
            return false;
        }
            for(int i=2;i<Math.sqrt(num);i++)
            {
                if(num%i==0)
                {
                    return false;
                }
            }
        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("no. to be checked is: ");
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println("Yes it is a Prime no.");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
