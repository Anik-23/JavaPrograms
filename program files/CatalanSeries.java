public class CatalanSeries
{
    int catalan(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        else{
        int res=0;

            for(int i=0;i<=n-1;i++)
            {
                res+=catalan(i)*catalan(n-i-1);
                
            }
            return(res);
        }
    }
    public static void main(String[] args)
    {
        CatalanSeries obj=new CatalanSeries();
        for(int i=0;i<10;i++)
        {
        System.out.print(" "+obj.catalan(i));
        }
    }
    
}
