//Pull request
package part2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Handbook {
    Map<String, Set<String>> map = new LinkedHashMap<>();
    Pattern pattern;



    public Handbook() {
         this.pattern= Pattern.compile("\\+\\d-\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d");
    }

    public void add(String surname, String phoneNumber) throws WrongPhoneFormat {
        Matcher matcher = pattern.matcher(phoneNumber);
        if (!matcher.find()) {
            throw new WrongPhoneFormat("Неправильный формат телефонного номера");
        }

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
