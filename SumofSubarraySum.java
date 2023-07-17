import java.util.Scanner;

class Solution{
    int totalofsubarraysum(int[] array){
        int b= array.length;
        int c= array.length;
        int sum=0;
        if(b%2==0){
            for(int i=0;i<(b/2);i++){
                sum = sum+(array[i]*c)+(array[b-i-1]*c);
                c=c+(b-(2*(i+1)));
            }
        }
        else{
            int i=0;
            for(i=0;i<(b/2);i++){
                sum = sum+(array[i]*c)+(array[b-i-1]*c);
                c=c+(b-(2*(i+1)));
            }
            if(i==(b/2)){
                sum=sum+(array[i]*c);
            }
        }
        return sum;
    }
}

public class SumofSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int size = sc.nextInt();
        System.out.print("Enter the elements if the array: ");
        int[] arr = new int[size];
        int i=0;
        while(i<size){
            arr[i] = sc.nextInt();
            i++;
        }
        Solution answer = new Solution();
        System.out.println("the sum of the subarraysum is: "+ answer.totalofsubarraysum(arr));
    }
}