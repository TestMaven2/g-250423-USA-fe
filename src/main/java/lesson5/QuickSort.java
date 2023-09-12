package lesson5;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {

        // 8   2   7   4   3   9   6   1   5

//        int[] array = {8, 2, 7, 4, 3, 9, 6, 1, 5};

        // Создаём исходный массив размером 30
        int[] array = new int[30];
        Random random = new Random();

        // Наполняем массив случайными числами от 0 до 49
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }

    /**
     * Задача метода - рекурсивно отсортировать массив
     *
     * @param array массив
     * @param start индекс начала сортируемой части
     * @param end   индекс конца сортируемой части
     */
    public static void quickSort(int[] array, int start, int end) {

        // Базовый случай
        if (start >= end) {
            return;
        }

        int pivotIndex = helperPivot(array, start, end);
        // рекурсивно сортируем левую часть
        quickSort(array, start, pivotIndex - 1);
        // рекурсивно сортируем правую часть
        quickSort(array, pivotIndex + 1, end);
    }

    /**
     * Задача метода - распределить элементы относительно опорного элемента
     *
     * @param array массив
     * @param start индекс начала сортируемой части
     * @param end   индекс конца сортируемой части
     * @return индекс опорного элемента после распределения
     */
    public static int helperPivot(int[] array, int start, int end) {
        int pivot = array[end];
        int pivotIndex = end;

        for (int i = start; i < pivotIndex - 1; i++) {
            if (array[i] >= pivot) {
                swap(array, pivotIndex, pivotIndex - 1);
                pivotIndex--;
                swap(array, i, pivotIndex + 1);
                i--;
            }
        }

        if (array[pivotIndex - 1] > pivot) {
            swap(array, pivotIndex, pivotIndex - 1);
            pivotIndex--;
        }

        return pivotIndex;
    }

    /**
     * Задача метода - поменять два элемента массива местами
     *
     * @param array       массив
     * @param firstIndex  индекс первого элемента
     * @param secondIndex индекс второго элемента
     */
    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
