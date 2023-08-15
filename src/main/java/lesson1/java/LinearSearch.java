package lesson1.java;

public class LinearSearch {

    public static void main(String[] args) {

        String[] array = {"Hello", "World", "I", "study", "algorithms"};
        System.out.println(linearSearch(array, "studyy"));
    }

    public static boolean linearSearch(String[] array, String value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }
}
