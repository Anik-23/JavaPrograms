// Anagrams
import java.util.*;
public class Anagrams {
    
    static void isAnagram(){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String Astring=sc.next();
        System.out.println("Enter the string to be checked");
        String Cstring=sc.next();
        if((Astring.length()!=0) && (Astring.length()==Cstring.length()))
        {
            char[] A=Astring.toLowerCase().toCharArray();
//            for(int i=0;i<Astring.length();i++)
//            {
//                A[i]=Astring.toLowerCase().charAt(i);
//            }
            char[] C=Cstring.toLowerCase().toCharArray();
//            for(int i=0;i<Astring.length();i++)
//            {
//                A[i]=Astring.toLowerCase().charAt(i);
//            }
            Arrays.sort(A);
            Arrays.sort(C);
            if(Arrays.equals(A, C))
            {
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Annagrams");
            }
        }
}
    
    
    
    public static void main(String[] args) {
        isAnagram();
    }
}
