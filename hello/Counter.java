public class Counter implements Comparable<Counter>{
    
   private final String name;
   private int count=0;
   
   public Counter(String id){
       name=id;
   }
   
   public void increment(){
       count++;
   }
   
   public int tally(){
       return count;
   }
   
   public String toString(){
       return count +"  "+name;
   }
   
    /**
     * Compares this counter to the specified counter.
     *
     * @param  that the other counter
     * @return <tt>0</tt> if the value of this counter equals
     *         the value of that counter; a negative integer if
     *         the value of this counter is less than the value of
     *         that counter; and a positive integer if the value
     *         of this counter is greater than the value of that
     *         counter
     */
    @Override
    public int compareTo(Counter that) {
        if      (this.count < that.count) return -1;
        else if (this.count > that.count) return +1;
        else                              return  0;
    }
}