import java.util.Scanner;
public class Fact {
    static int calFact(int n){
        if(n==0){
            return 1;
        }
        return(n*calFact(n-1));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. : ");
        int n=sc.nextInt();
        System.out.println("The factorial of given no. is: "+calFact(n));
    }
            
}
