import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import java.lang.Math;

public class Flips
{
    public static void main(String[] args)
    {
        int T=Integer.parseInt(args[0]);
        Counter heads= new Counter("heads");
        Counter tails=new Counter("tails");
        for(int t=0;t<T;t++)
            if(StdRandom.bernoulli(0.5))
              heads.increment();
             else tails.increment();
        StdOut.println(heads);
        StdOut.println(tails);
        int d=heads.tally() - tails.tally();
        StdOut.println("Delta: "+Math.abs(d));
    }
}