package part1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                "Конфета", "Плюшка", "Пончик", "Бегуди", "Суслик",
                "Плюшка", "Суслик", "Лангольер", "Баба Яга", "Ягода",
                "Морковь", "Свекла", "Морковь", "Свекла", "Морковь",
                "Терминатор", "Киборг", "Терминатор"
        ));

        System.out.println("Исходные слова: " + list);

        Set<String> set = new TreeSet<>();
        set.addAll(list);
        System.out.println("Уникальные слова: " + set);

        Map<String, Integer> hm = new HashMap<>();
        list.forEach((s) -> {
            Integer count = hm.get(s);
            hm.put(s, count == null ? 1 : count + 1);
        });
        System.out.println("Сколько повторов: " + hm);


    }
}
