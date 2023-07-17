

import java.util.Scanner;

public class rev {

    public static int LinearSearch(int arr[],int k) {
        int size=arr.length;
        int count=0;
        for(int i=0;i<size;i++) {
            if(arr[i]==k) {
                count++;
            }
            else {
                count=0;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int value=LinearSearch(arr,k);
        System.out.println(value);

    }

}
