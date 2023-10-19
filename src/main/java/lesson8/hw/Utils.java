package lesson8.hw;

public class Utils {

    public static int determineCost(int activityStart, int activityEnd) {
        int edge = 13;
        int temp = (activityStart + activityEnd) / 2;
//        return temp >= edge ? 2 : 1;
        if (temp >= edge) {
            return 2;
        } else {
            return 1;
        }
    }
}