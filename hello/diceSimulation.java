import java.util.Arrays;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class diceSimulation{
    public static void main(String[] args){
        
        int SIDES = 6;
        double[] dist = new double[2*SIDES+1];
        for (int i = 1; i <= SIDES; i++)
            for (int j = 1; j <= SIDES; j++)
            dist[i+j] += 1.0;
        for (int k = 2; k <= 2*SIDES; k++)
            dist[k] /= 36.0;
        
        
        
        
       int N=50000;
        
       int[] sum=new int[N];
       int a,b;
       for(int i=0;i<N;i++){
           a=StdRandom.uniform(1,7);
           b=StdRandom.uniform(1,7);
           sum[a+b]++;
       }
       
       for(int i=2;i<=12;i++)
           StdOut.println(dist[i]+"    "+i+"  "+sum[i]/(N*1.0));
        
    }
}
