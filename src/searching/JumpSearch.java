package searching;

/**
 * Jump Search
 *
 * @author maoyunfei
 * @date 2018/3/13
 */
public class JumpSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(jumpSearch(arr, 6));
    }

    public static int jumpSearch(int arr[], int x) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));

        int prev = 0;
        while (arr[Math.min(step, n) - 1] < x) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1;
            }
        }

        while (arr[prev] < x) {
            prev++;
            if (prev == Math.min(step, n))
                return -1;
        }

        if (arr[prev] == x)
            return prev;

        return -1;
    }
}
