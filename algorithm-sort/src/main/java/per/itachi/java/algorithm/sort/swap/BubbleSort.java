package per.itachi.java.algorithm.sort.swap;

public class BubbleSort implements SwapSort{

    @Override
    public void sort(int[] array) {
        if (array == null) {
            return;
        }
        for (int i = 0, length = array.length; i <= length - 1; ++i) {
            for (int j = 0; j <= length - 1 - i; ++j) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
