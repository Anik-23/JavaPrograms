
import java.util.*;

public class Sunny {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        
            while(T-- >0){
            
                int N=sc.nextInt();
                int K=sc.nextInt();
                int[] arr =new int[N];
                int sum=0;
                for(int i=0;i<N;i++){
                    
                    arr[i]=sc.nextInt();    
                }
                
                int temp=0;
                for(int i=0;i<N;i++){
                
                    for(int j=1;j<N;j++){
                    
                        if(arr[j]<arr[j-1]){
                        
                            temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                            
                        }
                    }
                }
                for(int i=0;i<K;i++){
                    if(arr[i]<0){
                        arr[i]*=-1;
                    }
                }
                for(int i=0;i<N;i++){
                
                    if(arr[i]>0){
                    
                        sum+=arr[i];
                    }
                }
                System.out.println(sum);
        
            }
        }
}

