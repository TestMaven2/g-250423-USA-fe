package lesson7.special_stack;

public class SpecialStack {

    private Integer[] elements = new Integer[7];
    private int index = -1;

    public boolean empty() {
        return index == -1;
    }

    public void push(Integer element) {

        if (index < elements.length - 1) {
            elements[++index] = element;
        } else {
            System.out.println("Стек переполнен!");
        }
    }

    public Integer pop() {
        if (empty()) {
            System.out.println("Стек пуст!");
            return null;
        }
        return elements[index--];
    }

    public Integer peek() {
        if (empty()) {
            System.out.println("Стек пуст!");
            return null;
        }
        return elements[index];
    }

    public int search(Integer element) {
        for (int i = 0; i <= index; i++) {
            if (elements[i].equals(element)) {
                return index - i + 1;
            }
        }
        return -1;
    }

    public Integer getMin() {
        if (empty()) {
            System.out.println("Стек пуст!");
            return null;
        }

        Integer min = elements[0];
        int minIndex = 0;

        for (int i = 1; i <= index; i++) {
            if (elements[i] < min) {
                min = elements[i];
                minIndex = i;
            }
        }

        for (int i = minIndex + 1; i <= index; i++) {
            elements[i - 1] = elements[i];
        }

        index--;
        return min;
    }

    @Override
    public String toString() {
        if (empty()) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i <= index; i++) {
            builder.append(elements[i]).append(", ");
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }
}