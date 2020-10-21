/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.Collectors;

class GFG {
    public static void main (String[] args) {
        //code
        Scanner s = new Scanner(System.in);
        int value = Integer.parseInt(s.nextLine());
        System.out.println("The value "+ value);
        StringBuffer sb = new StringBuffer();
        sb.append(s.nextLine());
        while (s.hasNextLine()){

            sb.append("\n");
            System.out.println(sb);
        }
        // System.out.println(" "+ value);
        for(int i = 0; i< value ; i++) {
            int size = Integer.parseInt(sb.substring(2*i, sb.indexOf("\n")));
            int[] arr = new int[size];
            arr=Arrays.asList(sb.substring(2*i+1, sb.indexOf("\n")).split(" ")).stream().mapToInt(Integer::parseInt).toArray();
            getMaximumSum(arr);
        }
    }

    public static int getMaximumSum(int[] arr) {
        int maxSum = 0;
        int min = -99999;
        for(int i = 0; i < arr.length; i ++) {
            maxSum += arr[i];
            if(arr[i] < 0)
                min = arr[i] > min ? arr[i] : min;
        }
        System.out.println(maxSum > 0 ? maxSum : min);
        return maxSum > 0 ? maxSum : min;
//        System.out.println("Max subarray sum is "+(maxSum > 0 ? maxSum : min)+" of elements "+Arrays.toString(arr)+" which is a contiguous subarray.");
    }
}