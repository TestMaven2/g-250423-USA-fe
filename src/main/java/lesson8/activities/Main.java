package lesson8.activities;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Activity> activities = new ArrayList<>();

        activities.add(new Activity("a", 1, 3));
        activities.add(new Activity("b", 1, 7));
        activities.add(new Activity("c", 2, 4));
        activities.add(new Activity("d", 5, 9));
        activities.add(new Activity("e", 4, 6));
        activities.add(new Activity("f", 7, 8));

        // 1 -> 3   4 -> 6   7 -> 8
        printActivities(activities);
    }

    public static void printActivities(List<Activity> activities) {
        System.out.println("Исходный список активностей:");
        System.out.println(activities);

        activities.sort((x, y) -> x.finish - y.finish);
        System.out.println("Активности, отсортированные по времени окончания");
        System.out.println(activities);

        // Объявляем результирующий список, куда будем
        // добавлять выбранные активности
        List<Activity> result = new ArrayList<>();

        // Отбираем первую активность в наш результат,
        // т.к. после сортировки эта активность будет иметь
        // наименьшее время окончания
        Activity firstActivity = activities.get(0);
        result.add(firstActivity);

        // Запоминаем время, когда заканчивается наша активность
        // Это нужно для того, чтобы отследить, чтобы последующие
        // активности при их выборе не начинались раньше,
        // чем заканчивается наша выбранная активность
        int finish = firstActivity.finish;

        // Идём циклом по всем оставшимся активностям
        for (int i = 1; i < activities.size(); i++) {

            // Получаем текущую активность из списка оставшихся
            Activity currentActivity = activities.get(i);

            // Если текущая активность начинается не раньше,
            // чем заканчиваются уже отобранные активности
            if (currentActivity.start >= finish) {

                // То добавляем эту активность в нашу выборку
                result.add(currentActivity);
                // и обновляем время, когда заканчиваются выбранные активности
                finish = currentActivity.finish;
            }
        }

        System.out.println("Выбранные активности:");
        System.out.println(result);
    }
}