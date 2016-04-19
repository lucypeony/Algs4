public class MaxPQ<Key extends Comparable<Key>>
{
    Comparable<Key>[] id;
    int pqSize;
    
    public MaxPQ(){
       
    }
    
    public MaxPQ(int max){
        id=new Key[max];
    }
    
    
    public MaxPQ(Key[] a){
        for(int i=0;i<a.length;i++)
            insert(a[i]);
    }
    
    public void insert(Key v){
        if(id.length=N){
            Key[] temp=new Key[2*N];
            for(int i=0;i<id.length;i++)
                temp[i]=id[i];
            
            id=temp;
        }
        
        int index=id.length;
        for(int i=id.length;i>0;i--)
            if(less(v,id[i]){
                index=i;
                break;
            }
            
       for(int j=id.length;j>target+1;j--){
           id[j+1]=id[j];
        }        
        
        id[target+1]=v;       
    }   
    
    private Key max(){
        return id[id.length-1];
    }
    
    
    public Key delMax(){
        if(!isEmpty())
            
    }
    
    private boolean isEmpty(){
    }
    
    private int size(){
    }
      
}