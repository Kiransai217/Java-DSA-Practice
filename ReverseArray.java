import java.util.*;
public class ReverseArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length-1; i++){
            if(i == ((arr.length-1)/2)+1){
                break;
            }
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1] =  arr[i];
            arr[i] = temp;
        }
        System.out.print("Reversed Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
