package per.itachi.java.algorithm.commons.binary;

public class BinarySearch {

    public int search(int[] array, int start, int end, int num) {
        while(start <= end) {
            int mid = (start + end) / 2;
            if (mid == array[mid]) {
                return mid;
            }
            else if (mid < array[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
