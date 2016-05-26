/*
 *  You are given an array x of n positive numbers. You start at point (0,0) and moves x[0] metres to the north, then x[1] metres to the west, x[2] metres to the south, x[3] metres to the east and so on. In other words, after each move your direction changes counter-clockwise.

Write a one-pass algorithm with O(1) extra space to determine, if your path crosses itself, or not. 
 */

public class Leet335 {
    public boolean isSelfCrossing(int[] x) {
        int len=x.length;
       
        int i=0;
        int a=0,b=0,c=0,d=0;
        while(i<len){
            switch(i % 4){
                case 0: a +=x[i];break;
                case 1: b +=x[i];break;
                case 2: c +=x[i];break;
                case 3: d +=x[i];break;  
            }//switch
            i++;
        }//while
        
        if(len>=4 && a>=c && d>=b)
            return true;
        else
            return false;
        
    }//method 
    
    public static void main(String[] args){
        int[] x={1,1,2,1,1};
        Leet335 myclass=new Leet335();
        System.out.println(myclass.isSelfCrossing(x));
    }//main
    
}//class