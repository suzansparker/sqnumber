

import java.util.Scanner;

public class prefix {
    static int n;

    public static int[]prefixsum(int arr[]) {
        int p[]=new int[n];
        p[0]=arr[0];
        for(int i=1;i<=n;i++) {
            p[i]=p[i-1]+arr[i];
        }
        return p;

    }
    public static void main(String[]args) {
        Scanner A=new Scanner(System.in);
        n=A.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i]=A.nextInt();
        }
        int prefix[]=prefixsum(arr);
        for(int i=0;i<n;i++) {
            System.out.println(prefix[i]+"");
        }
    }
}