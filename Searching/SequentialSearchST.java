import java.util.ArrayList;
/**
 To implement a Symbol Table using an Unordered Linked List
**/

public class SequentialSearchST<Key,Value>{
 private Node first;   //first node in the linked list
 private int nodeNum=0;

 private class Node{
  //linked-list node
  Key key;
  Value val;
  Node next;
  public Node (Key key,Value val,Node next){
   this.key=key;
   this.val=val;
   this.next=next;
  }
 }//private class

 public Value get(Key key){
  //Search for key ,return associated value
  for(Node x=first;x!=null;x=x.next)
   if(key.equals(x.key))
    return x.val;

  return null;
 }//get

 public void put(Key key,Value val){
  for(Node x=first;x !=null;x=x.next)
   if(key.equals(x.key))
   {
    x.val=val;
    return;
   }
  first=new Node(key,val,first);
  nodeNum++;
 }//put


  //remove key (and its value ) from table
 void delete(Key key){
  put(key,null);
 }


 //return is there a value paired with key ?
 boolean contains(Key key){
  return get(key) != null;
 }

 //is the table empty?
 boolean isEmpty(){
  return size()==0;
 }

 //return number of key-value pairs in the table
 int size(){
  return nodeNum;
 }




 //all the keys in the table,in sorted order
 Iterable<Key>  keys(){
     ArrayList<Key> myarray=new ArrayList<Key>();
     for(Node x=first;x !=null;x=x.next){
         myarray.add(x.key);
     }
 }



}
