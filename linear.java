import java.util.*;

public class linear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int search = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        searching(search, arr);
    }

    static void searching(int search, int arr[]) {
        for (int i = 0; i < 5; i++) {
            if (arr[i] == search) {
                System.out.println("Found");
                break;
            } else {
                System.out.println("Bad Luck!");
                break;
            }
        }
    }
}
