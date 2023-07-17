import java.util.Scanner;

public class minmax {
    public static int minmax(int arr[]) {
        int size=arr.length;
        int arr_min=Integer.MAX_VALUE;
        int arr_max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++) {
            if(arr[i]>arr_max) {
                arr_max=arr[i];
            }
            if(arr[i]<arr_min) {
                arr_min=arr[i];
            }
        }
        int latestMin=-1;
        int latestMax=-1;
        int result=size;
        for(int i=0;i<size;i++) {
            if(arr[i]==arr_min) {
                latestMin=i;
                if(latestMin>=0) {
                    result=Math.min(result,i-latestMax+1);
                }
            }
            if(arr[i]==arr_max) {
                latestMax=i;
                if(latestMax>=0) {
                    result=Math.min(result,i-latestMin+1);
                }
            }
        }
        return result;
    }

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int value=minmax(arr);
        System.out.println(value);

    }

}