import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class CircleLine{
    public static void main(String[] args){
        int N=Integer.parseInt(args[0]);
        double p=Double.parseDouble(args[1]);
        
        StdDraw.setScale(-1,N+1);
        
        StdDraw.setPenRadius(0.005);
        double[] x=new double[N+1];
        double[] y=new double[N+1];
        
        for(int i=1;i<N+1;i++){
            double rad=2*Math.PI/N;
            x[i]=N/2+Math.cos(rad *i)*N/2;
            y[i]=N/2+Math.sin(rad *i)*N/2;
            StdDraw.point(x[i],y[i]);
        }//end for 
        
        StdDraw.setPenRadius(0.001);
        
        for(int i=1;i<N+1;i++){
            for(int j=i+1;j<N+1;j++){
                double thres=StdRandom.uniform();
                if(thres<p)
                    StdDraw.line(x[i],y[i],x[j],y[j]);
            }
        }
        
    }//main 
}