import java.util.Scanner;
public class ConvertNumToWord {
    
    static void nToW(int num){
            
        String[] onedigit=new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] twodigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen"};  
        String[] multipleoftens = new String[] {"","ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
            "Eighty", "Ninety"};  


        if(num/1000>0){
        
            System.out.print(onedigit[num/1000]+" thousand");
            num=num-((num/1000)*(1000));
        }
        if(num/100>0){
        
            System.out.print(" "+onedigit[num/100]+" hundred");
            num=num-((num/100)*100);
        }

        if(num/10>0){
            int tens=num/10;
            int once=num-((num/10)*10);
            if((once>0)&&(tens==1)){
            System.out.print(" "+ twodigits[once+tens]);
            }
            else if(once == 0){
                System.out.print(" "+multipleoftens[tens]);
            }
            else{
                System.out.print(" "+multipleoftens[tens] + " "+onedigit[once]);
            }
        }
        if(num/10==0){
        
            System.out.println(" "+onedigit[num]);
        }
        
        
    
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        nToW(num);
    }

    private static void elseif(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
