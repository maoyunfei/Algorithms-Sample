package searching;

import java.util.Arrays;

/**
 * Exponential Search
 *
 * @author maoyunfei
 * @date 2018/3/13
 */
public class ExponentialSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(exponentialSearch(arr, 7, 6));
    }

    public static int exponentialSearch(int arr[], int n, int x) {

        if (arr[0] == x) {
            return 0;
        }

        int i = 1;
        while (i < n && arr[i] <= x) {
            i = i * 2;
        }

        return Arrays.binarySearch(arr, i / 2, Math.min(i, n), x);
    }
}
