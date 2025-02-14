import edu.princeton.cs.algs4.WeightedQuickUnionUF;
import edu.princeton.cs.algs4.StdOut;

public class Percolation
{
    //0-closed ,1-open
    private int[] states;
    private int side;
    private WeightedQuickUnionUF cellStorage;
    
    //Create N-by-N grid ,with all sites blocked 
    public Percolation(int N)
    {
        side=N;
        //+2 are for additional top and bottom cells 
        cellStorage =new WeightedQuickUnionUF(N*N+2);
        states=new int[N*N+2];
        for(int index=0;index<N*N;index++)
        {
            states[index]=0;
        }
        states[N*N]=1;
        states[N*N+1]=1;
    }
    
    //open site (row i,column j) if it is not already
    public void open(int i,int j)
    {
        checkRange(i,j);
        if(isOpen(i,j)) return ;
        int cell=getCellIndex(i,j);
        states[cell]=1;
        
        //if not top row
        if(i!=0 && isOpen(i-1,j)){
            union(getCellIndex(i-1,j),cell);
        }else if (i==0){
            //connect to virtual top cell 
            union(cell,side*side);
        }
        
        //if not bottom row 
        if(i!=(side-1)&& isOpen(i+1,j)){
            union(getCellIndex(i+1,j),cell);
        }else if (i==(side-1)){
            //connect to virtual bottom cell
            union(cell,side*side+1);
        }
        
        //if not left border
        if(j!=0 && isOpen(i,j-1)){
            union(getCellIndex(i,j-1),cell);
        }
        
        //if not right border
        if(j!=side-1 && isOpen(i,j+1)){
            union(getCellIndex(i,j+1),cell);
        }
    }
    
    
    private void checkRange(int i,int j){
        if(i<0 || j<0 || j>=side || i>=side){
            throw new IndexOutOfBoundsException();
        }
    }
    
    
    private void union(int a,int b)
    {
        if(!cellStorage.connected(a,b)){
            cellStorage.union(a,b);
        }
    }
    
    
    //is site(row i,column j) open ?
    public boolean isOpen(int i,int j){
        checkRange(i,j);
        return states[getCellIndex(i,j)]==1;
    }
    
    //is site(row i,columen j) full ?
    public boolean isFull(int i,int j ){
        checkRange(i,j);
        return cellStorage.connected(side*side,getCellIndex(i,j));
    }
    
    
   //does the system percolate?
    public boolean percolates(){
        return cellStorage.connected(side*side,side*side+1);
    }
    
 
 public int numberOfOpenSites(){
  int count=0;
  for(int i=0;i<side*side;i++)
   if (states[i]==1)
    count++;
   
  return count;
 }
 
 
 
    private int getCellIndex(int row,int column){
        return side*row+column;
    }
}


    
    
        
        