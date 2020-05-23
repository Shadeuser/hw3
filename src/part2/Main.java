//Pull request
package part2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Handbook handbook = new Handbook();
        try {
            handbook.add("Иванов", "+7-950-454-3154");
            handbook.add("Петров", "+7-971-742-0368");
            handbook.add("Иванов", "+7-978-354-3654");
            handbook.add("Петров", "+7-960-745-0425");
            handbook.add("Сидоров", "+7-978-354-3654");
            handbook.add("Иванов", "+7-960-355-4624");
        } catch (WrongPhoneFormat e) {
            e.printStackTrace();
        }


        System.out.println("Иванов " + handbook.get("Иванов"));
        System.out.println("Петров " + handbook.get("Петров"));
        System.out.println("Сидоров " + handbook.get("Сидоров"));
    }
}
