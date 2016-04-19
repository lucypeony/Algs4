import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class TopM
{
    public static void main(String[] args)
    {
        //Print the top M lines in the input stream 
        int M=Integer.parseInt(args[0]);
        MinPQ<Transaction> pq=new MinPQ<Transaction>(M+1);
        while(StdIn.hasNextLine())
        {
            //Create an entry from the next line and put on the PQ
            pq.insert(new Transacton(StdIn.readLin()));
            if(pq.size()>M)
                pq.delMin();
        }
        
        Stack<Transaction> stack=new Stack<Transaction>();
        while(!pq.isEmpty()) stack.push(pq.delMin());
        for(Transaction t:stack) StdOut.println(t);
    }
}
