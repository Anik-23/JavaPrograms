import java.util.Scanner;
public class Union {
    
    
    static void union(){
    
        Scanner sc = new Scanner(System.in);
        int len1,len2;
        
        System.out.println("Enter the length of the arrays");
        
        len1=sc.nextInt();
        len2=sc.nextInt();
        
        int[] arr1=new int[len1];
        int[] arr2=new int[len2];
        
        System.out.println("Enter data of first array");
        for(int i=0;i<len1;i++){
        
            arr1[i]=sc.nextInt();
        
        }
        for(int i:arr1){
        
            System.out.print(" "+i);
        }
        System.out.println("Enter data of second array");
        for(int i=0;i<len2;i++){
        
            arr2[i]=sc.nextInt();
        }
        for(int i:arr2){
        
            System.out.print(" "+i);
        }
        
        int[] newarr=new int[len1+len2];
        
        if(len1>len2){
        
            for(int i=0;i<len1;i++){
            
                    for(int j=0;j<len2;j++){
                                
                        if(arr1[i] != arr2[j]){
//                            int n=0;
                            newarr[i]=arr1[i];
//                            n+=1;
                        }
                    }
                }
                    for(int k:newarr){
                        
                        System.out.println(k);
                    }
        }
    
    }
    
    
    
    public static void main(String[] args) {
        
        union();
    }
}
