package lesson6;

public class Main {

    public static void main(String[] args) {

        DynamicArray array = new DynamicArray();

        System.out.println("Пустой ли массив? - " + array.isEmpty());
        System.out.println(array);

        array.add("A");
        array.add("B");
        array.add("C");

        System.out.println("Пустой ли массив? - " + array.isEmpty());
        System.out.println(array);

        array.add("D");
        array.add("E");
        array.add("F");
        array.add("G");
        array.add("H");
        array.add("I");
        array.add("J");
        array.add("K");

        System.out.println(array);

        array.add(5, "L");

        System.out.println("После вставки по индексу:");
        System.out.println(array);

        array.remove();
        System.out.println("После удаления последнего элемента:");
        System.out.println(array);

        array.removeAt(1);
        System.out.println("После удаления по индексу:");
        System.out.println(array);

        array.set(3, "M");
        System.out.println("После замены:");
        System.out.println(array);

        System.out.println("Существует ли в массиве значение I? - " + array.contains("I"));
        System.out.println("Существует ли в массиве значение X? - " + array.contains("X"));

        array.clean();
        System.out.println("После очищения:");
        System.out.println(array);
    }
}
