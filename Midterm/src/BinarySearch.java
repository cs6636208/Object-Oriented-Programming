public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        int key = 10;
        while (start <= end) {
            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        System.out.println("Element not found");
    }
}
