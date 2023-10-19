package lesson8.hw;

public class Activity {

    private String name;
    private int start;
    private int end;
    private int value;

    public Activity(String name, int start, int end, int value) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "name='" + name + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", value=" + value +
                '}';
    }
}