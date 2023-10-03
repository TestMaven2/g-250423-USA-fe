package lesson8.activities;

public class Activity {

    String name;
    int start;
    int finish;

    public Activity(String name, int start, int finish) {
        this.name = name;
        this.start = start;
        this.finish = finish;
    }

    @Override
    public String toString() {
        // Name: 10 -> 12
        return String.format("%s: %d -> %d", name, start, finish);
    }
}