import java.util.*;

public class binary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int lim = sc.nextInt();
        int l = 0, r = lim - 1;
        int arr[] = new int[lim];
        for (int i = 0; i < lim; i++) {
            arr[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        sc.close();
        binarySearch(l, r, search, arr);

    }

    static void binarySearch(int l, int r, int search, int arr[]) {
        l = 0;
        r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == search) {
                System.out.println("Element found");
                break;
            } else if (arr[mid] < search) {
                l = mid + 1;
            } else if (arr[mid] > search) {
                r = mid - 1;
            } else {
                System.out.println("Not found");
            }
        }
    }
}

// binary search for sorted array