import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;


public class ThreeSum{
    private ThreeSum(){}
    
    public static void printAll(int[] a){
        int N=a.length;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                for(int k=j+1;k<N;k++){
                    if(a[i]+a[j]+a[k]==0){
                        StdOut.println(a[i]+" "+a[j]+" "+a[k]);
                        }
                    }
                }
            }
        }
    
    /*
     * Returns the number of triples(i,j,k) with i<j<k such that a[i]+a[j]+a[k]==0
     */
    public static int count(int[] a){
        int N=a.length;
        int cnt=0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                for(int k=j+1;k<N;k++){
                    if(a[i]+a[j]+a[k]==0){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
    
    public static void main(String[] args){
       
         In in = new In(args[0]);
        int[] a = in.readAllInts();

        Stopwatch timer = new Stopwatch();
        int cnt = count(a);
        StdOut.println("elapsed time = " + timer.elapsedTime());
        StdOut.println(cnt);
    }
}