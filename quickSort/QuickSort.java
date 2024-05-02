package quickSort;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {10, 92, 83, 2, 3, 74, 1};
        quicksort(array, 0, array.length - 1);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static void quicksort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particionar(array, inicio, fim);
            quicksort(array, inicio, indicePivo - 1);
            quicksort(array, indicePivo + 1, fim);
        }
    }

    public static int particionar(int[] array, int inicio, int fim) {
        int pivo = array[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivo) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;
        return i + 1;
    }
}
