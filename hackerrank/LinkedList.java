import java.io.*;
import java.util.*;
class Node{
 int data;
 Node next;
 Node(int d){
        data=d;
        next=null;
    }//node 
}//class

class LinkedList
{
     public static  Node insert(Node head,int data)
 {
   //Complete this method
    Node temp=new Node(data);
    if(head==null){
        head=temp;
    }else{
        Node start=head;
        while(start.next!=null)
            start=start.next;
        start.next=temp;
    }//if 
    
    return head;
 }//insert
    
    public static void display(Node head)
    {
          Node start=head;
          while(start!=null)
          {
              System.out.print(start.data+" ");
              start=start.next;
          }
    }
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          Node head=null;
          int T=sc.nextInt();
          while(T-->0){
              int ele=sc.nextInt();
              head=insert(head,ele);
          }
          display(head);

   }
}