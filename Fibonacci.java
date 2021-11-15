import java.util.Scanner;
public class Fibonacci {
static void fiboSeries(int n){
    int n1=0;
    int n2=1;
    int n3;
    System.out.print("Fibo series of passed no. is : 0 1");
    for(int i=0;i<n-2;i++){
        n3=n1+n2;
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;   
                
    }
}
static int rFibo(int n){

    if(n<=1)return n;
    return rFibo(n-2)+rFibo(n-1);
}

static int[] f; 
static int irFibo(int n){

    if(n<=1){
    
        f[n]=n;
        return n;
    }
    else{
    
        if(f[n-2]==-1){
        
            f[n-2]=irFibo(n-2);
        }
        if(f[n-1]==-1){
        
            f[n-1]=irFibo(n-1);
        }
        return f[n-2]+f[n-1];
    }
    
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. to which you want fibonacci series:");
        int n=sc.nextInt();
        f=new int[n];
        for(int i=0;i<n;i++){
        
            f[i]=-1;
        }
        
//        iterative method
        fiboSeries(n);
//        recursive method
        System.out.println(" "+rFibo(n));
        
//        improved recursive method call by memorization
        System.out.println("the enter term is : "+irFibo(n));
        System.out.println("The series of first n terms is:");
        for(int i=0;i<n;i++){
            System.out.println(f[i]);
        }
    }
}
