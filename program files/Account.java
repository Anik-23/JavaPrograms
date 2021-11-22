// Program Here
public class Account
{
//    private data members
    private long acc_no;
    private String name,email;
    private float ammount;
    
//    getter method
    public long getAcc_no()
    {
        return acc_no;
    }
//    setter method
    public void setAcc_no(long Acc_no)
    {
                this.acc_no=Acc_no;                
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String Name)
    {
        this.name=Name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String Email)
    {
        this.email=Email;
    }
    public float getAmmount()
    {
        return ammount;
    }
    public void setAmmount(float Ammount)
    {
        this.ammount=Ammount;
    }
    
    public static void main(String[] args) 
    {
        Account obj=new Account();
//        Setting the values for the private data we have
        obj.setName("Anik Gupta");
        obj.setAcc_no(7599013500L);
        obj.setEmail("anik.gupta");
        obj.setAmmount(142000f);
//        Now getting the value by getter method

        System.out.println("welcome "+obj.getName()+"\nYour account No is : "+obj.getAcc_no()+"\nEmail id : "+obj.getEmail()+"\nBalance : "+obj.getAmmount());
        
        
    }
}

