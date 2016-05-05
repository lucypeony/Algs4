/*
  BST ,left nodes are smaller;
      right nodes are larger;
*/

public class BST<Key extends Comparable<Key>,Value>{
  private Node root;            //root of BST

  private class Node{
    private Key key;
    private Value val;
    private Node left,right;
    private int N;

    public Node(Key key,Value val,int N)
    { this.key=key;this.val=val;this.N=N;}
  }

  public int size()
  {return size(root);}

  private int size(Node x){
    if(x==null) return 0;
    else        return x.N;
  }

  public Value get(Key key){
    return get(root,key);
  }//get

  public Value get(Node x,Key key){
    //Return value associated with key in the subtree rooted at x;
    //return null if key not present in subtree rooted at x
    if(x==null) return null;
    int cmp=key.compareTo(x.key);
    if(cmp<0) return get(x.left,key);
    else if(cmp>0) return get(x.right,key);
    else return x.val;
  }//get


  public void put(Key key,Value val){
    root=put(root,key,val);
  }//put


  public Node put(Node x,Key key,Value val){
    if(x==null) return new Node(key,val,1);
    int cmp=key.compareTo(x.key);
    if(cmp<0) x.left=put(x.left,key,val);
    else if (cmp>0) x.right=put(x.right,key,val);
    else x.val=val;

    x.N=size(x.left)+size(x.right)+1;
    return x;
  }//put


  public Key min(){
    return min(root);
  }//min


  public Key min(Node x){
    if(x==null) return null;

    Node temp=x;
    while(temp.left !=null)
      temp=temp.left;

    return temp.key;
  }//min


  public Key max(Node x){
    if(x==null) return null;

    Node temp=x;
    while(temp.right !=null)
      temp=temp.right;

    return temp.key;
  }//max

  public Key floor(Key key){
    Node x=floor(root,key);
    if(x==null) return null;
    return x.key;
  }//floor


  public Node floor(Node x,Key key){
    if(x==null) return null;
    int cmp=key.compareTo(x.key);
    if(cmp==0) return x;
    if(cmp<0) return floor(x.left,key);

    Node t=floor(x.right,key);
    if(t !=null) return t;
    else         return x;

  }//floor

  public Key ceiling(Key key){
    Node x=ceiling(root,key);
    if(x==null) return null;
    return x.key;
  }//ceiling

  public Node ceiling(Node x,Key key){
    if(x==null) return null;

    int cmp=key.compareTo(x.key);
    if(cmp==0) return return x;
    if(cmp>0) return ceiling(x.right,key);

    Node t=ceiling(x.left,key);
    if(t != null) return t;
    else          return x;
  }//ceiling



}//class 
