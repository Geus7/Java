import java.util.Scanner;

    public class javacode4 {
        public static void gcd(int a, int b) {
            int c;
            if (a > b) {
                c = a % b;
                a = b;
                b = c;

                if (c == 0) {
                    return;
                } else {
                    gcd(a, b);
                }
            }else{
                c = b % a;
                b = a;
                a = c;

                if (c == 0) {
                    return;
                } else {
                    gcd(a, b);
                }

            }
            System.out.println("The gcd is : " + c );
        }

        public static void main(String[] args) {
            System.out.println("Enter the two numbers to find gcd using Euclidean algorithm: ");
            Scanner sc = new Scanner(System.in);
            Integer a = sc.nextInt();
            Integer b = sc.nextInt();
            gcd(a, b);
        }
    }
