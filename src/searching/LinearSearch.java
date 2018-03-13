package searching;

/**
 * 线性搜索
 *
 * @author maoyunfei
 * @date 2018/3/13
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 6};
        System.out.println(linearSearch(arr, 7, 5));
    }

    public static int linearSearch(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
