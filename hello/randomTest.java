import  edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdDraw;
import java.util.Arrays;
    
    public class randomTest{
        public static void main(String[] args){
            int N=50;
            double[] a =new double[N];
            for(int i=0;i<N;i++)
                a[i]=StdRandom.random();
            
            Arrays.sort(a);
            
            for(int i=0;i<N;i++){
                double x=1.0*i/N;
                double y=a[i]/2.0;
                double rw=0.5/N;
                double rh=a[i]/2.0;
                StdDraw.filledRectangle(x,y,rw,rh);
            }
        }
    }
        