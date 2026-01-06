import java.util.*;
public class KthElement {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number of Elements:");
        int n = scan.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the Elements:");
        for(int i = 0; i<n; i++){
            arr[i] = scan.nextInt();

        }
        System.out.print("Enter the value of K:");
        int k = scan.nextInt();

        Arrays.sort(arr);

        System.out.println("Kth Smallest Element is:"+ arr[k-1]);

    }
}
