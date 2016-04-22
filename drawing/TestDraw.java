import edu.princeton.cs.algs4.StdDraw;
public class TestDraw{
    public static void main(String[] args){
        StdDraw.setPenColor(StdDraw.BLUE);
        double t=Math.sqrt(3)/2;
        StdDraw.line(0,0,1,0);
        StdDraw.line(0,0,0.5,t);
        StdDraw.line(0.5,t,1,0);
         StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(0.5,t/3);
    }
}
        