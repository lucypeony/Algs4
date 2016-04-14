import edu.princeton.cs.algs4.WeightedQuickUnionUF;


public class Percolation1{
 
 //0 for closed, 1 for open 
 private int state[];
 private WeightedQuickUnionUF uf;
 private int side;
 
 //Create N-by-N grid,with all sites blocked
 public Percolation1(int N){
  state =new int[N*N+2];
  uf =new WeightedQuickUnionUF(N*N+2);
  
  side=N;
  
  //all sites are closed by default 
  for(int i=0;i<N*N;i++)
     state[i]=0;  
  
  state[N*N]=1;
  state[N*N+1]=1;
 }
 
 //open site (row i,column j) if it is not open already
 public void open(int i,int j){
  checkRange(i,j);
  if(!isOpen(i,j))
   state[getCellIndex(i,j)]=1;
  
  //if site(row i, column j) not in the first row ,union this site and the site above it 
  if(i!=1 && isOpen(i-1,j))
   uf.union(getCellIndex(i,j),getCellIndex(i-1,j));
  else if (i==1)
      uf.union(getCellIndex(i,j),side*side);
  
  if(i!=side && isOpen(i+1,j))
   uf.union(getCellIndex(i,j),getCellIndex(i+1,j));
  else if(i==side)
      uf.union(getCellIndex(i,j),side*side+1);
  
  if(j!=1 && isOpen(i,j-1))
   uf.union(getCellIndex(i,j),getCellIndex(i,j-1));
  
  if(j!=side && isOpen(i,j+1))
   uf.union(getCellIndex(i,j),getCellIndex(i,j+1));
 }
 
 //is site (row i,column j ) open?
 public boolean isOpen(int i,int j){
     checkRange(i,j);
  if(state[getCellIndex(i,j)]==1) 
   return true;
  else 
   return false;
 }
 
 
 //is site(row i,column j) full?
 public boolean isFull(int i,int j){
     checkRange(i,j);
  return uf.connected(side*side,getCellIndex(i,j));
 }
 
 
 //does the system percolates?
 public boolean percolates(){
  return uf.connected(side*side,side*side+1);
 }
 
 private int getCellIndex(int i, int j){
  return (i-1)*side + j-1;
 }
 
 private void checkRange(int i,int j){
  if(i>side | i <=0 | j>side | j <=0 ) 
   throw new IndexOutOfBoundsException();
 }
}