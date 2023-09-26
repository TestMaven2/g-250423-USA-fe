package lesson7.stack;

public class MyStackTest {

    public static void main(String[] args) {

        MyStack stack = new MyStack();
        stack.pop();

        System.out.println("Пустой ли стек? - " + stack.empty());
        System.out.println(stack);
        System.out.println();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("После добавления элементов:");
        System.out.println(stack);
        System.out.println("Пустой ли стек? - " + stack.empty());
        System.out.println();

        String element = stack.pop();
        System.out.println("Извлечённый элемент - " + element);
        System.out.println("После извлечения элемента:");
        System.out.println(stack);
        System.out.println();

        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println("Пустой ли стек? - " + stack.empty());

        stack.pop();

        stack.push("A");
//        stack.push("A");
//        stack.push("A");
//        stack.push("A");
//        stack.push("A");
//        stack.push("A");
//        stack.push("A");
//        stack.push("A");
//        stack.push("A");
//        stack.push("A");

        System.out.println();

        System.out.println(stack);

        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        System.out.println(stack);

        element = stack.peek();
        System.out.println("Полученный элемент - " + element);
        System.out.println("После метода peek:");
        System.out.println(stack);

        System.out.println("Позиция элемента D - " + stack.search("D"));
        System.out.println("Позиция элемента B - " + stack.search("B"));
        System.out.println("Позиция элемента F - " + stack.search("F"));
    }
}