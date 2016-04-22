import edu.princeton.cs.algs4.StdDraw;
public class Checkboard{
    public static void main(String[] args){
        int N=Integer.parseInt(args[0]);
        StdDraw.setScale(0.0,N+1);
        for(int i=1;i<N+2;i++)
        {
            StdDraw.line(i,1,i,N+1);
            StdDraw.line(1,i,N+1,i);
        }
    }//end of main
}