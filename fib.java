import java.util.*;

public class fib {
    public static void printSeries(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        for (int i = 0; i < n; i++) {
            System.out.print(n1 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n = sc.nextInt();
        sc.close();
        printSeries(n);
    }
}

// 0 1 1 2 3 5 8 13 24