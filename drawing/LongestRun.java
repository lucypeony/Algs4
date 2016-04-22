import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class LongestRun{
    public static void main(String[] args){
        int N=Integer.parseInt(args[0]);
        int temp=StdIn.readInt();
        int last=temp;
        int cons=1;
        int maxlast=temp;
        int maxcons=1;
        for(int i=1;i<N;i++){
            temp=StdIn.readInt();
            if(temp==last){
                cons++;
            }else{
                 cons=1; 
                 last=temp;
            }
            
            if(cons>maxcons){
                  maxcons=cons;
                  maxlast=last;
                }
            }
             StdOut.println(maxcons+"  "+maxlast);
        }
       
    }

        