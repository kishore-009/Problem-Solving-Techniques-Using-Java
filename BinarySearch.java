import java.util.*;
public class BinarySearch {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int arr[] = {10,20,30,40,50,60};

        System.out.print("Enter the Array index To Search:");
        int Target = scan.nextInt();

        int low = 0;
        int high = arr.length - 1;
        boolean found = false;

        while(low<=high){

            int mid = (low+high)/2;


            if(arr[mid] == Target){
                System.out.println("The Target is Found at the Index " +mid);
                found = true;
                break;
            }
            else if(arr[mid]< Target){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }


        }
        if(!found){
            System.out.println("Element Not Found!");
        }
    }
}
