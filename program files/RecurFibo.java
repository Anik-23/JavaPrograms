import java.util.Scanner;
public class RecurFibo {
    static int n1=0;
    static int n2=1;
    static int n3;
static void fiboSeries(int count){
    if(count>0){
    n3=n1+n2;
    n1=n2;
    n2=n3;
    System.out.print(" "+n3);
    fiboSeries(count-1);
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int count = sc.nextInt();
        System.out.println("The series of given no. is: 0 1");
        fiboSeries(count-2);
    }
}
