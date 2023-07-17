import java.util.Arrays;
import java.util.Scanner;

public class evennum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int[] array = new int[size];
        for(int a=0;a<size;a++){
            array[a]=sc.nextInt();
        }
        int el= sc.nextInt();
        int[][] query=new int[el][2];
        for(int i=0;i<el;i++) {
            for (int j = 0; j < 2; j++) {
                query[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(even_numbers_range(array,query)));

    }

    static int[] even_numbers_range(int[] array, int[][] arr) {
        int[] result=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            int count=0;
            int l = arr[i][0];
            int r = arr[i][1];
            for(int j=l;j<=r;j++){
                if(array[j]%2==0){
                    count++;
                }
            }
            result[i]=count;
        }
        return result;
    }
}
