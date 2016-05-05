/**
	To implement a Symbol Table using an Unordered Linked List 
**/

public class SequentialSearchST<Key,Value>{
	private Node first;			//first node in the linked list 
	
	
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
	}//put 
	
}