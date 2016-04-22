import edu.princeton.cs.algs4.StdDraw;
public class Rose{
    
    private static void petals(int num){
       double del_theta=0.001;
       for(double theta=0;theta<2*Math.PI;theta=theta+del_theta){
            double x=5*Math.cos(num*theta)*Math.cos(theta);
            double y=5*Math.cos(num*theta)*Math.sin(theta);
            StdDraw.point(x,y);
       }
    }
    
    
    
    
    public static void main(String[] args){
        int N=Integer.parseInt(args[0]);
        StdDraw.setScale(-N,N+1);
        petals(N);
        
        
    }//main
}//end of file