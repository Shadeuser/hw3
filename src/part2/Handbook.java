package part2;

import java.util.*;

public class Handbook {
    Map<String, Set<String>> map = new LinkedHashMap<>();

    public Handbook() {
    }

    public void add(String surname, String phoneNumber) {
        Set<String> set = new TreeSet<>();
        if (map.get(surname) != null) {
            set.addAll(map.get(surname));
        }
        set.add(phoneNumber);
        map.put(surname, set);
    }
    public Set<String> get(String surname) {
        return map.get(surname);
    }

    public int getSize() {
        return map.size();
    }

}
