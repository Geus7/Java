import java.util.*;

public class javacode3 {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        System.out.printf("Sorted array: %s", Arrays.toString(a));
    }
}
