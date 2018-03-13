package searching;

/**
 * Interpolation Search
 *
 * @author maoyunfei
 * @date 2018/3/13
 */
public class InterpolationSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(interpolationSearch(arr, 6));
    }

    public static int interpolationSearch(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high && x >= arr[low] && x <= arr[high]) {
            int pos = low + (((high - low) / (arr[high] - arr[low])) * (x - arr[low]));
            if (arr[pos] == x) {
                return pos;
            }
            if (arr[pos] < x) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }
        return -1;
    }
}
