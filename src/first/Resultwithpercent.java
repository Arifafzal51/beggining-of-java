package first;

import java.util.Scanner;

public class Resultwithpercent
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("The marks of first subject is =");
        int s1 =s.nextInt();
        System.out.println("The marks of second subject is =");
        int s2 =s.nextInt();
        System.out.println("The marks of third subject is =");
        int s3 =s.nextInt();
        System.out.println("The marks of fourth subject is =");
        int s4 =s.nextInt();
        System.out.println("The marks of fifth subject is =");
        int s5 =s.nextInt();
        int r = s1 + s2 + s3 + s4 + s5;
        System.out.println("Total number of student are=");
        System.out.println(r);
        float p;
        p= ((float)r/500)*100;
        System.out.println("percent marks of student is=");
        System.out.println(p);


    }
}

