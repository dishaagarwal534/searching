import java.util.*;

public class gcd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        hcf(a, b);
    }

    static void hcf(int a, int b) {
        int mod = a % b;
        while (mod != 0) {
            a = b;
            b = mod;
            mod = a % b;
        }
        System.out.println(b);
    }
}

// gcd/hcf of two numbers
