package concepts.java8.nonobjects;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(java.time.LocalDateTime.now());
    }
}
