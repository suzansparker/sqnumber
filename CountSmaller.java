import java.util.Arrays;
import java.util.Scanner;

public  class CountSmaller {
    void constructLowerArray(int arr[], int countSmaller[],
                             int n)
    {


        for (int i = 0; i < n; i++) {
            countSmaller[i]=0;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    countSmaller[i]++;
            }
        }
    }
    void printArray(int arr[], int size)
    {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args)
    {
        CountSmaller small = new CountSmaller();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int n1 = arr.length;
        int low[] = new int[n1];
        small.constructLowerArray(arr, low, n1);
        small.printArray(low, n1);
    }
}
