import java.lang.*;
import java.util.Scanner;


class Node
{
    private int Data;
    private Node Next;
    private Node Prev;

    public Node()
    {
        Data = 0;
        Next = null;
        Prev = null;
    }
    public Node(int d, Node n)
    {
        Data = d;
        Next = n;
        Prev = n;
    }
    public void setData(int d)
    {
        Data = d;
    }
    public void setNext(Node n)
    {
        Next = n;
    }
    public void setPrev(Node n)
    {
        Prev = n;
    }
    public int getData()
    {
        return(Data);
    }
    public Node getNext()
    {
        return(Next);
    }
    public Node getPrev()
    {
        return(Prev);
    }
}
class LinkedList
    {
        private int Size;
        private Node Start;
        private Node End;
        public LinkedList(){
            Size = 0;
            Start = null;
            End = null;
        }
        public void insertAtFirst(int val){
            Node n,t1,t2;
            t1 = Start;
            t2 = End;
            n= new Node();
            if(Start==null && End==null)
            {
                Start = n;
                End = n;
            }
            else{
            n.setData(val);
            n.setNext(Start);
            t1 = n;
            t2.setNext(t1);
            t1.setPrev(t2);
            }
            Size++;
        }
        public void insertAtLast(int val){
            Node n,t1,t2;
            n = new Node();
            n.setData(val);
            t1= Start;
            t2= End;
            if(Start==null && End==null)
            {
                Start = n;
                End  = n;
            }
            else{
                t2.setNext(n);
                n.setPrev(t2);
                t2 = n;
                t2.setNext(t1);
                t1.setPrev(t2);
            }
            
            Size++;
        }
        public void insertAtpos(int val, int pos){
            
            if(pos==1)
            {
                insertAtFirst(val);
            }
            else if(pos==Size+1)
            {
                insertAtLast(val);
            }
            else if(pos>1 && pos<=Size){
                Node n,t;
                n = new Node(val,null);
                t=Start;
                for(int i=1; i<pos-1;i++)
                {
                    t= t.getNext();
                }
                n.setNext(t.getNext());
                t.setNext(n);
                Size++;
            }
        }
        public void DeleteFirst()
        {
            Node t1;
            t1=Start;
            if(Start==null)
            {
                System.out.println("List is already Empty");
            }
            else{
                t1 = t1.getNext();
                Size--;
            }
        }
        public void DeleteLast()
        {
            if(Start==null)
            {
                System.out.println("List is already Empty");
            }
            else if(Size==1){
                Start = null;
                Size--;
            }  
            else
            {
                Node t1;
                t1=Start;
                for(int i=1; i<Size-1; i++)
                {
                    t1=t1.getNext();
                }
                t1.setNext(t1);
                Size--;
            }
        }
        public void DeleteAtpos(int pos)
        {
            
            if(Start==null)
            {
                System.out.println("List is already Empty");
            }
            else if(pos<1 || pos>Size){
                System.out.println("Invalid Position");
            }  
            else if(pos==1)
            {
                DeleteFirst();
            }
            else if(pos==Size+1)
            {
                DeleteLast();
            }
            else
            {
                Node t,t1;
                t=Start;
                for(int i=1; i<pos-1; i++)
                {
                    t=t.getNext();
                }
                t1=t.getNext();
                t.setNext(t1.getNext());
                Size--;
            }
        }
        public boolean isEmpty(){
           Node t;
           t=Start;
            if(t==null)
            {return true;}
            else
            {return false;}
        }
        public int getListSize(){
            return(Size);
        }
        public void ViewList(){
            Node t;
            t=Start;
            if(isEmpty())
            {System.out.print("List is Empty");}
            else{
                for(int i=1; i<=Size; i++)
                {
                    System.out.print(" "+t.getData());
                    t = t.getNext();   
                }
            }
        }
    }
    
    

class Program2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList List = new LinkedList();
        boolean flag = true;
        while(flag){
        System.out.println("1 inser at first");
        System.out.println("2 insert at last");
        System.out.println("3 insert at position");
        System.out.println("4 Delete First");
        System.out.println("5 Delete Last");
        System.out.println("6 Delete at position");
        System.out.println("7 view list");
        System.out.println("8 Exit");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        int position,val;
        switch(choice)
        {
            case 1:
            System.out.println("Enter value");
            val = sc.nextInt();
            List.insertAtFirst(val);
            break;
            case 2:
            System.out.println("Enter value");
            val = sc.nextInt();
            List.insertAtLast(val);
            break;
            case 3:
            System.out.println("Enter Position");
            position = sc.nextInt();
            System.out.println("Enter value of list item");
            val = sc.nextInt();
            List.insertAtpos(val,position);
            break;
            case 4:
            List.DeleteFirst();
            break;
            case 5:
            List.DeleteLast();
            break;
            case 6:
            System.out.println("Enter Position");
            position = sc.nextInt();
            List.DeleteAtpos(position);
            break;
            case 7:
                 List.ViewList();
                 break;
            case 8:
                 flag=false;
                 break;
            default :
            System.out.println("Invalid choice");     

        }
    }
    }
}