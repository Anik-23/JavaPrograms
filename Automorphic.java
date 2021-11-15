import java.util.Scanner;
public class Automorphic {

    static void automorphic(int n){
    
        int dup=n;
        int square=n*n;
        if(n/10==0){
        if(square%10==n){
            System.out.println("Automorphic no.");
        }
        else{
        
            System.out.println("Not an Automorph");
        }
        }
        else{
        int count=0;
        while(dup>0){
        
            count++;
            dup=dup/10;
        }
        boolean status=false;
        while(count>0){
        
            count-=1;
            if(square%10==n%10){
            
                status=true;
            }else status=false;
        }
        if(status){
        
            System.out.println("Automorphic");
        }else System.out.println("Not an Automorph");
        

        }
        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        automorphic(n);
        
    }
}
