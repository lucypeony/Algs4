import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HourValue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int max=-70;
        for(int i=0;i<4;i++){
            int temp=0;
            for(int j=0;j<4;j++){
                temp=arr[i][j]+arr[i][j+1]+arr[i][j+2];
                temp +=arr[i+1][j+1];
                temp +=arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(temp>max)
                    max=temp;
            }//for j
        }//for i
        
        System.out.println(max);
        
    }//main
}
