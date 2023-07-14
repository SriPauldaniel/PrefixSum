import java.util.Scanner;
public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr1 = findPrefixSum(arr,n);
        for(int i=0;i<n;i++) {
            System.out.print(arr1[i]+ " ");
        }
        sc.close();
    }

    public static int[] findPrefixSum(int[] arr,int n) {
        int[] arr1 = new int[n];
        int sum = arr[0];
        arr1[0] = sum;
        for(int i=1;i<n;i++) {
            sum += arr[i];
            arr1[i] = sum;
        }
        return arr1;
    }
}