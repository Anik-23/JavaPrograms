import java.util.*;
public class Pallindrome {
    
    static void isPallindrome(){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be checked");
        String Pstring=sc.next();
        String Rstring="";
        int Plength=Pstring.length();
        if(Plength==0){
            System.out.println("Invalid String");
        }
        else{
            
            for(int i=Plength-1;i>=0;i--){
                
               Rstring+=Pstring.charAt(i);
            }

            if(Pstring.equals(Rstring)){   
              System.out.println("Pallindrome");
            }
            else{
                System.out.println("Not Pallindrome");
            }
        }
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        isPallindrome();
    }
}
