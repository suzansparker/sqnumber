

import java.util.Scanner;

public class seclargest {
    public static int SecondLargest(int arr[]) {
        int size=arr.length;
        if(size<2) {
            return -1;
        }
        int max=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<size;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        for(int i=0;i<size;i++) {
            if(arr[i]>second && arr[i]!=max) {
                second=arr[i];
            }
        }

        return second;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int number=SecondLargest(arr);
        System.out.println(number);
    }

}