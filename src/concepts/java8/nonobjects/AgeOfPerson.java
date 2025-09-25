package concepts.java8.nonobjects;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeOfPerson {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1993, 12, 12);
        LocalDate today = LocalDate.now();
        System.out.println(ChronoUnit.YEARS.between(birthDay, today));

        }
}
