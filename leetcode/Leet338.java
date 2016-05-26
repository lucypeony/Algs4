/*
 * Given a non negative integer number num. For every numbers i in the range 0 ¡Ü i ¡Ü num calculate the number of 1's in their binary representation and return them as an array.

Example:
For num = 5 you should return [0,1,1,2,1,2].

Follow up:

    It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
    Space complexity should be O(n).
    Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.

Hint:

    You should make use of what you have produced already.
    Divide the numbers in ranges like [2-3], [4-7], [8-15] and so on. And try to generate new range from previous.
    Or does the odd/even status of the number help you in calculating the number of 1s?

 */

public class Leet338 {
    public int[] countBits(int num) {
        int[] res=new int[num+1];
        res[0]=0;
        
        if(num==0)
            return res;
        
        res[1]=1;
        
        if(num==1)
            return res;
        
        int p=2;
        int q=0;int diff=2;
        while(q<=num){
            q=p+diff-1;
            for(int i=p;i<=q  && i<=num;i++){
                res[i]=1+res[i-diff];
            }//for
            p=q+1;
            diff *=2;
            
        }//while 
        
        return res;
    }//method 
    
    
    public static void main(String[] args){
        int num=1;
        Leet338 myclass=new Leet338();
        int[] res=myclass.countBits(num);
        int len=res.length;
        for(int i=0;i<len;i++)
            System.out.print(res[i]+" ");
    }//main
}//class 