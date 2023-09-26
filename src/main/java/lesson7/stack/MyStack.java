package lesson7.stack;

public class MyStack {

    private String[] elements = new String[10];
    private int size = 0;

    /**
     * Проверка стека на пустоту
     *
     * @return true, если стек пустой
     */
    public boolean empty() {
        return size == 0;
    }

    /**
     * Добавление элемента в стек
     *
     * @param element добавляемый элемент
     */
    public void push(String element) {

        if (size == 10) {
            System.out.println("Стек полон! Добавлять некуда.");
            return;
        }

        elements[size++] = element;
    }

    /**
     * Извлечение элемента из стека
     *
     * @return последний добавленный элемент
     */
    public String pop() {

        if (empty()) {
            System.out.println("Стек пуст! Извлекать нечего.");
            return null;
        }

        String element = elements[--size];
        elements[size] = null;
        return element;
    }

    /**
     * Получение элемента с вершины стека
     *
     * @return последний добавленный элемент
     */
    public String peek() {

        if (empty()) {
            System.out.println("Стек пуст! Извлекать нечего.");
            return null;
        }

        return elements[size - 1];
    }

    /**
     * Поиск элемента в стеке
     *
     * @param element элемент, который ищем
     * @return позиция найденного элемента с вершины стека
     *         -1, если элемент не найден
     */
    public int search(String element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return size - i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {

        if (empty()) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            builder.append(elements[i]).append(", ");
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }
}