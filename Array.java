import java.util.*;
public class Array{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int arr[] ={10,20,30,40,50};
        System.out.print("Enter the Array Index:");
        int index = scan.nextInt();

        if(index >= 0 && index< arr.length){
            System.out.println(arr[index]);
        }
        else{
            System.out.println("Invalid Index");
        }
        System.out.println(arr.length);
    }


}

