    import java.io.*;
    import java.util.*;
    import java.util.regex.Pattern;


    public class String_token {

      
        public static void main(String[] args) 
        {

      
          Scanner scan = new Scanner(System.in);
          String s=scan.nextLine();
          
          boolean left=true;
          boolean right=false;
          
          int len=s.length();
          int temp=0;
          while(s.charAt(temp)==' ')
              temp++;
          
          int MAX=100;
          String[] sc=new String[MAX];
          
          char[] c=new char[MAX];
          int clen=0;
          int count=0;
          for(int i=temp;i<len;i++){
              if(s.charAt(i)==' ' || s.charAt(i)=='!' || s.charAt(i)==',' || s.charAt(i)=='?' || s.charAt(i)=='.' ||
                 s.charAt(i)=='\\' || s.charAt(i)=='_' ||s.charAt(i)=='\'' || s.charAt(i)=='@')
                  left=true;
              else
                  left=false;
              if(left){
                  if (clen>0){
                  String stemp=new String(c);
                  sc[count]=stemp.substring(0,clen+1);
                  count ++;
                  clen=0;
                  }
              }else{
                  clen++;
                  c[clen]=s.charAt(i);
              }//else 
              
          }//for 
           
          //He is a very very good boy, isn't he?
          
          System.out.println(count);
          for(int i=0;i<count;i++)
              System.out.println(sc[i]);

        }//main
    }//class 
