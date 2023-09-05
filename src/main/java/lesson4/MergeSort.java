package lesson4;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {

        int[] array = new int[30];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30);
        }

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));

        mergeSort(array);

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));

    }

    public static void mergeSort(int[] array) {

        // Базовый случай. Прекращаем рекурсивное деление массива.
        if (array.length == 1) {
            return;
        }

        // Вычисляем длины левого и правого подмассивов
        int leftLength = array.length / 2;
        int rightLength = array.length - leftLength;

        // Создаём левый и правый подмассив
        int[] leftArray = new int[leftLength];
        int[] rightArray = new int[rightLength];

        // Наполняем значениями левый и правый подмассив
//        for (int i = 0; i < leftArray.length; i++) {
//            leftArray[i] = array[i];
//        }

        System.arraycopy(array, 0, leftArray, 0, leftLength);
        System.arraycopy(array, leftLength, rightArray, 0, rightLength);

        // Вызываем рекурсивно сортировку для левой и для правой части
        mergeSort(leftArray);
        mergeSort(rightArray);

        // Объявляем управляющие индексы-указатели для левого, правого и результирующего массива
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        // Копируем наименьшие элементы из левого и правого массивов
        // в результирующий, пока один из массивов не закончится
        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                array[resultIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[resultIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }

        // Переносим остаток из левого массива в результирующий, если он есть
        while (leftIndex < leftArray.length) {
            array[resultIndex] = leftArray[leftIndex];
            leftIndex++;
            resultIndex++;
        }

        // Переносим остаток из правого массива в результирующий, если он есть
        while (rightIndex < rightArray.length) {
            array[resultIndex] = rightArray[rightIndex];
            rightIndex++;
            resultIndex++;
        }
    }
}
