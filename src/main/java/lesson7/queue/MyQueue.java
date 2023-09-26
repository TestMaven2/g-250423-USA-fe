package lesson7.queue;

public class MyQueue {

    private String[] elements = new String[10];
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public boolean empty() {
        return size == 0;
    }

    public void push(String element) {

        if (tail == elements.length - 1) {
            System.out.println("Очередь переполнена! Добавлять некуда.");
            return;
        }

        if (!empty()) {
            tail++;
        }
        elements[tail] = element;
        size++;
    }

    public String pop() {

        if (empty()) {
            System.out.println("Очередь пуста! Извлекать нечего.");
            return null;
        }

        String element = elements[head++];
        elements[head - 1] = null;
        size--;

        if (empty()) {
            head = 0;
            tail = 0;
        }

        return element;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {

        if (empty()) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        for (int i = head; i <= tail; i++) {
            builder.append(elements[i]).append(", ");
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }
}