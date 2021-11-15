import java.util.Scanner;
public class PatternPrinting {
    
    static void pattern1(){
        for(int i=0;i<5;i++){
            
            for(int j=0;j<=i;j++){
            System.out.print("*");
        
            }
            System.out.println();
        }
    }
    
    static void pattern2(){
    
        for(int i=0;i<5;i++){
        
            for(int j=4;j>i;j--){
            
                System.out.print(" ");
                
            }
            
            for(int k=5-(4-i);k>0;k--){
            
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void pattern3(){
        
        int i,j,row=6;
       
        
        for(i=1;i<=row;i++){
            
        for(j=row-i+1;j>1;j--){
        
            System.out.print(" ");
        
        }
        for(j=1;j<=i+(i-1);j++){
        
            System.out.print("*");
        
        }
            System.out.println();
            
        
        }
    
    }
    
    static void Pattern4(){
    
        int i,j,row;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter row length: ");
        row=sc.nextInt();
        
        for(i=1;i<=row;i++){
            
        for(j=row-i+1;j>1;j--){
        
            System.out.print(" ");
        
        }
        for(j=1;j<=i+(i-1);j++){
        
            System.out.print("*");
        
        }
            System.out.println();
            
        
        }
        
        int r=row;
        for(i=0;i<row;i++){

            for(j=0;j<=i;j++){
                
                System.out.print(" ");
            }
            for(j=r+(r-3);j>0;j--){
                System.out.print("*");    
            }
            r--;
            for(j=0;j<=i;j++){
            
                System.out.print(" ");
            
            }
            System.out.println();
            
        }
      
}
    static void pattern5(){
    
        int i,j,row=7;
        int r=row;
        for(i=0;i<row;i++){
        
            for(j=r;j>0;j--){
                System.out.print(" "+"*");
            }
            r--;
            for(j=0;j<i;j++){
            
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
        Pattern4();
        pattern5();
    
}
}