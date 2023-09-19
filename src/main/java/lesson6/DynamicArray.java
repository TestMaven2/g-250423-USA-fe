package lesson6;

public class DynamicArray {

    private String[] array;
    private int defaultSize = 10;
    private int size;

    public DynamicArray() {
        array = new String[defaultSize];
    }

    public DynamicArray(int capacity) {
        array = new String[capacity];
    }

    //    добавляет в конец
    public void add(String data) {
        if (size == array.length) {
            growSize();
        }
        array[size++] = data;
    }

//    добавляет по индексу
    public void add(int index, String data) {
        if (index < 0 || index > size) {
            System.out.println("Передан некорректный индекс");
            return;
        }

        if (size == array.length) {
            growSize();
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = data;
        size++;
    }

//    удаляет последний
    public void remove() {
        array[--size] = null;
    }

//    удаляет по индексу
    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Передан некорректный индекс");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[--size] = null;
    }

//    увеличивает размер
    private void growSize() {
        String[] newArray = new String[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

//    изменяет элемент
    public void set(int index, String data) {
        if (index < 0 || index >= size) {
            System.out.println("Передан некорректный индекс");
            return;
        }

        array[index] = data;
    }

//    удаляет все элементы
    public void clean() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

//    проверяет существует ли элемент
    public boolean contains(String data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return true;
            }
        }
        return false;
    }

//    вернет false, если в структуре есть элемент
    public boolean isEmpty() {
        return size == 0;
    }

//    для удобного вывода массива в консоль
    @Override
    public String toString() {
        // пустой - []
        // не пустой - [A, B, C]
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            builder.append(array[i]).append(", ");
        }

        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }
}