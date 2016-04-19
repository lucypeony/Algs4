import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;


public class Insertion
{
    public static void sort(Comparable[] a)
    {
        int N=a.length;
        for(int i=1;i<N;i++){
            for(int j=0;j<i;j++){
                if(less(a[i],a[j])){
                    Comparable target=a[i];
                    for(int k=i-1;k>=j;k--)
                        a[k+1]=a[k];
                    a[j]=target;
                    break;
                }//end of if 
            }//end of int j for
        }
    }
    
    private static boolean less(Comparable v,Comparable w)
    {
        return v.compareTo(w)<0;
    }
    
    private static void exch(Comparable[] a, int i,int j)
    {
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    
    private static void show(Comparable[] a)
    {
        for(int i=0;i<a.length;i++)
            StdOut.print(a[i]+" ");
        StdOut.println();
    }
    
    public static boolean isSorted(Comparable[] a)
    {
        for(int i=1;i<a.length;i++)
            if(less(a[i],a[i-1]))
                   return false;
               
         return true;
    }
    
    public static void main(String[] args)
    {
        String[] a=In.readStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
          