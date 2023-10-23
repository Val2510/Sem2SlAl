public class Sort {
    public static void bubSort(int[] arr){


        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }
    }
    public static void quickSort(int[] arr, int left, int right){
        if(arr == null || arr.length == 0 || left >= right) return;
        int pivot = (right - left)/2 + left;
        int midPoint = arr[pivot];
        int l = left;
        int r = right;
        while(l <= r){
            while(arr[l] < midPoint) l++;
            while(arr[r] > midPoint) r--;
            if(l <= r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        if(left < r) quickSort(arr, left, r);
        if (right > l) quickSort(arr, l, right);
    }
    public static int binarySearch(int[] arr, int find, int left, int right){
        int index = -1;

        while (left <= right) {
            int pivot = left + (right - left) / 2;
            if (arr[pivot] < find) {
                left = pivot + 1;
            } else if (arr[pivot] > find) {
                right = pivot - 1;
            } else if (arr[pivot] == find) {
                index = pivot;
                break;
            }
        }
        return index;
    }

    private static int LEFT(int i) {
        return (2 * i + 1);
    }
    private static int RIGHT(int i) {
        return (2 * i + 2);
    }
    private static void swap(int[] sortArr, int i, int j) {
        int swap = sortArr[i];
        sortArr[i] = sortArr[j];
        sortArr[j] = swap;
    }
    private static void heapify(int[] sortArr, int i, int size) {
        int left = LEFT(i);
        int right = RIGHT(i);
        int largest = i;
        if (left < size && sortArr[left] > sortArr[i]) largest = left;
        if (right < size && sortArr[right] > sortArr[largest]) largest = right;
        if (largest != i) {
            swap(sortArr, i, largest);
            heapify(sortArr, largest, size);
        }
    }
    public static int pop(int[] sortArr, int size) {
        if (size <= 0) {
            return -1;
        }
        int top = sortArr[0];
        sortArr[0] = sortArr[size-1];
        heapify(sortArr, 0, size - 1);
        return top;
    }

    public static void heapSort(int[] sortArr) {
        int n = sortArr.length;
        int i = (n - 2) / 2;
        while (i >= 0) {
            heapify(sortArr, i--, n);
        }
        while (n > 0) {
            sortArr[n - 1] = pop(sortArr, n);
            n--;
        }
    }
}
