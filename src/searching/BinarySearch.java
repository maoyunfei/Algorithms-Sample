package searching;

/**
 * 二分搜索
 *
 * @author maoyunfei
 * @date 2018/3/13
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 6};
        System.out.println(binarySearch(arr, 0, 6, 7));
    }

    public static int binarySearch(int arr[], int l, int r, int x) {
        if (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                return binarySearch(arr, mid + 1, r, x);
            } else {
                return binarySearch(arr, l, mid - 1, x);
            }
        }
        return -1;
    }
}
