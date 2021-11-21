//program of stack using linked list
import java.util.Scanner;
class Node
{
    int data;
    Node next;
}
public class StackExampleLinkedList 
{   
    Node top;
    StackExampleLinkedList()
    {
       top=null;
    }
    void push()//Insert
    {
       System.out.println("enter data");
       Scanner sc2=new Scanner(System.in);
       int newitem =sc2.nextInt();
       
       Node newnode=new Node();
       newnode.data=newitem;
       newnode.next=top;
       
       top=newnode;
       System.out.println("data inserted......");
          
    }
    void pop()//Delete
    {
       if(top==null)
        {
            System.out.println("Stack is empty");
        }
        else
       {
            System.out.println("delete element: "+top.data);
            top=top.next;
       }
        
    }
    void traverse()//View
    {
      if(top==null)
      {
          System.out.println("Stack empty");
      }
        else
      {
      Node current;
       for(current=top;current!=null;current=current.next)
       {
         System.out.println(current.data);   
       }
              
      }
        
        
    }
    void peek()
    {
        System.out.println(top.data);
    }
    public static void main(String[] args)
    {
        
        StackExampleLinkedList obj= new StackExampleLinkedList();
        while(true)
        {
            System.out.println("Press 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for peek");
            System.out.println("Press 5 for exit\n");
            
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            
            
            switch(ch)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 5:
                    System.exit(0);
                    break;
                case 4:
                    obj.peek();
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }
            
}