import java.util.Scanner;

public class arrrleader {
    void Lead(int arr[], int a)
    {
        for (int i = 0; i < a; i++)
        {
            int j;
            for (j = i + 1; j < a; j++)
            {
                if (arr[i] <=arr[j])
                    break;
            }
            if (j == a)
                System.out.print(arr[i] + ", ");
        }
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        LeadersInArray lead = new LeadersInArray();
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        lead.Lead(arr, n);
    }
}