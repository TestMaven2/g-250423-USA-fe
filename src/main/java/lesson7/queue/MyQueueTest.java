package lesson7.queue;

public class MyQueueTest {

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();
        System.out.println("Пустая ли очередь? - " + queue.empty());
        System.out.println(queue);
        System.out.println();

        queue.push("A");
        queue.push("B");
        queue.push("C");
        System.out.println("Пустая ли очередь? - " + queue.empty());
        System.out.println(queue);
        System.out.println();

        System.out.println("Размер очереди - " + queue.size());
        System.out.println();

        String element = queue.pop();
        System.out.println("Извлечённый элемент - " + element);
        System.out.println("Очередь после извлечения:");
        System.out.println(queue);
        System.out.println();

        queue.pop();
        queue.pop();
        queue.pop();

        queue.push("A");
        queue.push("B");
        queue.push("C");
        System.out.println("Пустая ли очередь? - " + queue.empty());
        System.out.println(queue);
        System.out.println();

        queue.push("C");
        queue.push("C");
        queue.push("C");
        queue.push("C");
        queue.push("C");
        queue.push("C");
        queue.push("C");
        System.out.println(queue);

        queue.push("D");
    }
}