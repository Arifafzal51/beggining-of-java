import java.util.*;
public class arrey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("user give array input :");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("my array is :");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
    }
}
