import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.StdOut;


public class PercolationStats{
    private double[] attempts;
    
    public PercolationStats(int N,int T)
    {
        if(N<=0 || T<=0) throw new IllegalArgumentException();
        attempts=new double[T];
        for(int i=0;i<T;i++){
            Percolation perc=new Percolation(N);
            int steps=0;
            while(!perc.percolates())
                {
                    int row=StdRandom.uniform(N)+1;
                    int column=StdRandom.uniform(N)+1;
                    if(!perc.isOpen(row,column)){
                        perc.open(row,column);
                        steps++;
                    }
                }
                attempts[i]=(double)steps/(N*N);
            }
        }

        
        
        public double mean(){
            return StdStats.mean(attempts);
        }
        
        
        public double stddev(){
            return StdStats.stddev(attempts);
        }
        
        
        public double confidenceLo(){
            return mean()-((1.96*stddev())/Math.sqrt(attempts.length)); 
        }  
        // returns upper bound of the 95% confidence interval
        public double confidenceHi(){
            return mean()+((1.96*stddev())/Math.sqrt(attempts.length)); 
        }          
        // test client, described below
        public static void main(String[] args){
            PercolationStats ps=new PercolationStats(300,1000); 
            StdOut.print("mean = "+ps.mean()+"\n");
            StdOut.print("std dev = "+ps.stddev()+"\n");
            StdOut.print("95% confidence interval = "+ps.confidenceLo()+", "+ps.confidenceHi());
        }   
    }