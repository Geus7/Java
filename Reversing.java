import java.util.Scanner;

public class Reversing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        String reversed = reverseWords(input);
        System.out.println("Reversed string: " + reversed);
    }
    public static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = 0;
        while (start < arr.length) {
            while (end < arr.length && arr[end] != ' ') {
                end++;
            }
            reverse(start, end - 1, arr);
            start = end + 1;
            end = start;
        }
        return new String(arr);
    }
    private static void reverse(int l, int r, char[] arr) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}
