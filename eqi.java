package Equinum;
import java.util.*;
import java.util.Scanner;

public class eqi {
    public static int [] prefixSum(int arr[]){
        int prefix_array[]=new int[arr.length];
        prefix_array[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix_array[i]=prefix_array[i-1]+arr[i];
        }
        return prefix_array;
    }
    public static int equilibrium(int []arr){
        int count=0;
        int min= Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[arr.length-1]-arr[i]){
                count=count+1;
                if(min>i){
                    min=i;
                }
            }

        }
        if(count==0){
            return -1;
        }
        return min;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int pref_array[]=prefixSum(arr);
        int val=equilibrium(pref_array);
        System.out.println(val);


    }
}