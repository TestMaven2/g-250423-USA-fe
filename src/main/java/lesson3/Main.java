package lesson3;

public class Main {

    public static void main(String[] args) {

        // Посчитать сумму всех чисел от 1 до n
//        System.out.println(getSumByIteration(5));
        System.out.println(getSumByRecursion(5));
    }

    public static int getSumByIteration(int n) {
        System.out.println("Метод начал работу с входящим значением - " + n);
        int result = 0;
        System.out.println("Значение промежуточного результата - " + result);
        for (int i = 1; i <= n; i++) {
            System.out.println("Прибавляем к результату значение - " + i);
            result = result + i; // Сокращённый вариант - result += i;
            System.out.println("Значение промежуточного результата - " + result);
        }
        System.out.println("Окончательный результат - " + result);
        return result;
    }

    public static int getSumByRecursion(int n) {
        System.out.println("Метод вызван со значением - " + n);
        if (n == 1) {
            System.out.println("Отработал базовый случай. Возвращаем результат 1.");
            return 1;
        }

        System.out.println("Рекурсивно вызываем метод со значением - " + (n - 1));
        int result = getSumByRecursion(n - 1);
        System.out.println("Получен результат от рекурсивного вызова - " + result);
        result = result + n;
        System.out.println("Вычислен результат - " + result);
        return result;
    }
}