package part2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Handbook handbook = new Handbook();
        handbook.add("Иванов", "8-950-454-3154");
        handbook.add("Петров", "8-971-742-0368");
        handbook.add("Иванов", "8-978-354-3654");
        handbook.add("Петров", "8-960-745-0425");
        handbook.add("Сидоров", "8-978-354-3654");
        handbook.add("Иванов", "8-960-355-4624");

        System.out.println("Иванов " + handbook.get("Иванов"));
        System.out.println("Петров " + handbook.get("Петров"));
        System.out.println("Сидоров " + handbook.get("Сидоров"));
    }
}
