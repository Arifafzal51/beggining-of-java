import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the first value");
        int A = S.nextInt();
        System.out.println("Enter the second value");
        int B = S.nextInt();
        int s = A + B;
        System.out.println("The sum is " + s);
        int sub = A - B;
        System.out.println("The sub is " + sub);
        float d = (float) A / B;
        System.out.println("The devide is" + d);
        int m = A * B;
        System.out.println("The multiply is " + m);
        //System.out.println();
    }
}