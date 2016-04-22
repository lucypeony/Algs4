public class DivisorPattern{
    public static void main(String[] args){
        int max=Integer.parseInt(args[0]);
        for(int i=1;i<=max;i++){
            for(int j=1;j<=max;j++){
                if(i % j==0 || j % i ==0) 
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println(i);
        }
    }
}