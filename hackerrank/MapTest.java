//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class MapTest{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String,Object> m=new HashMap<String,Object>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            m.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(m.containsKey(s)){
              System.out.println(s+"="+m.get(s));
            }else{
                System.out.println("Not Found");
            }//else
        }
        in.close();
    }
}
