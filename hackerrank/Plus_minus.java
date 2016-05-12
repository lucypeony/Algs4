import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Plus_minus{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int pos=0,zero=0,neg=0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]>0)
                pos++;
            else if (arr[arr_i]<0)
                neg++;
            else 
                zero++;
        }
        System.out.format("%.6f%n",pos*1.0/n);
        System.out.format("%.6f%n",neg*1.0/n);
        System.out.format("%.6f%n",zero*1.0/n);
    }
}
