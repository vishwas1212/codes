package concepts.java8.objects;

import demo.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BreadWinnerDriver {
    public static void main(String[] args) {
        List<BreadWinner> breadWinners = new ArrayList<BreadWinner>();

        breadWinners.add(new BreadWinner(111, "Jiya Brein", 32, "Female", "HR", 2011, 22700.0));
        breadWinners.add(new BreadWinner(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        breadWinners.add(new BreadWinner(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        breadWinners.add(new BreadWinner(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        breadWinners.add(new BreadWinner(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        breadWinners.add(new BreadWinner(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        breadWinners.add(new BreadWinner(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        breadWinners.add(new BreadWinner(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        breadWinners.add(new BreadWinner(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        breadWinners.add(new BreadWinner(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        breadWinners.add(new BreadWinner(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        breadWinners.add(new BreadWinner(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        breadWinners.add(new BreadWinner(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        breadWinners.add(new BreadWinner(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        breadWinners.add(new BreadWinner(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        breadWinners.add(new BreadWinner(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        breadWinners.add(new BreadWinner(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        System.out.println("1----");
        //Q.1 How many males and females are there in organization?
        Map<String, Long> genderMap = breadWinners.stream()
                .collect(Collectors.groupingBy(BreadWinner::getGender, Collectors.counting()));
        System.out.println("Gender wise counting: " + genderMap);

        System.out.println("2----");
        //Q.2 Print the name of all departments?
        Set<String> deptSet = breadWinners.stream()
                .map(BreadWinner::getDepartment)
                .collect(Collectors.toSet());
        System.out.println("Department Set: " + deptSet);

        System.out.println("3----");
        //Q.3 what is the average age of male and female?
        Map<String, Double> averageAgeByGender = breadWinners.stream()
                .collect(Collectors.groupingBy(BreadWinner::getGender,
                        Collectors.averagingLong(BreadWinner::getAge)));
        System.out.println("Average age by Gender: " + averageAgeByGender);

        System.out.println("4----");
        //Q.4 Get the details of highest paid employee?

        BreadWinner highestPaidBreadWinner = breadWinners.stream()
                .max(Comparator.comparingDouble(BreadWinner::getSalary)).get();
        System.out.println("Highest Paid: " + highestPaidBreadWinner);

        BreadWinner highestPaidBreadWinnerWayTwo = breadWinners.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(BreadWinner::getSalary))).get();
        System.out.println("Highest Paid Way Two: " + highestPaidBreadWinnerWayTwo);

        System.out.println("5----");
        //Q.5 Get the names of all the employees who joined after 2015?

        List<String> empNameJoinedAfter2015 = breadWinners.stream()
                .filter(doj -> doj.yearOfJoining > 2015)
                .map(emp -> emp.getName())
                .collect(Collectors.toList());
        System.out.println("BreadWinners Joined after 2015: " + empNameJoinedAfter2015);

        System.out.println("6----");
        //Q.6 Count the members of employee of each department

        Map<String, Long> breadWinnersEachDept = breadWinners.stream()
                .collect(Collectors.groupingBy(BreadWinner::getDepartment,
                        Collectors.counting()));
        System.out.println("BreadWinners details dept wise: " + breadWinnersEachDept);

        System.out.println("7----");
        //Q.7 Average salary fo each department

        Map<String, Double> avgSalPerDept = breadWinners.stream()
                .collect(Collectors.groupingBy(
                        BreadWinner::getDepartment,
                        Collectors.averagingDouble(BreadWinner::getSalary)));
        System.out.println("Average salary per dept: " + avgSalPerDept);

        System.out.println("8----");
        //Q.8 Get the youngest male employee from product development dept?
        BreadWinner youngestEmployeeOFProdDev = breadWinners.stream()
                .filter(dept -> dept.getDepartment().startsWith("Product"))
                .min(Comparator.comparingDouble(BreadWinner::getAge))
                .filter(gender -> gender.getGender().startsWith("Male"))
                .get();
        System.out.println("Youngest BW from the Prod and Dev team: " + youngestEmployeeOFProdDev);

        System.out.println("9----");
        //Q.9 find the breadwinner having most working experience?
        String mostExperinceBW = breadWinners.stream()
                .sorted(Comparator.comparingDouble(BreadWinner::getYearOfJoining))
                .map(BreadWinner::getName)
                .findFirst()
                .get();
        System.out.println("Most Experince BW: " + mostExperinceBW);

        System.out.println("10----");
        //Q.10 Find Male and Females working in sales and marketing
        Map<String, Long> FindBirdWinnerByGenderInSalesMarketing = breadWinners.stream()
                .filter(m -> m.getDepartment().startsWith("Sales"))
                .collect(Collectors.groupingBy(BreadWinner::getGender,
                        Collectors.counting()));
        System.out.println("Total Males & Females in Sales: " + FindBirdWinnerByGenderInSalesMarketing);

        System.out.println("11----");
        //Q.11 find average salary of males and females
        Map<String, Double> averageSalOfMale = breadWinners.stream()
                .collect(Collectors.groupingBy(BreadWinner::getGender,
                        Collectors.averagingDouble(BreadWinner::getSalary)));
        System.out.println("Average Salary of male: " + averageSalOfMale);

        System.out.println("12----");
        //Q.12 List down all the names of all employees in each department
        Map<String, List<BreadWinner>> departmentMap = breadWinners.stream()
                .collect(Collectors.groupingBy(BreadWinner::getDepartment));
        Set<Map.Entry<String, List<BreadWinner>>> entrySet = departmentMap.entrySet();
        for (Map.Entry<String, List<BreadWinner>> entry : entrySet) {
            System.out.println("------------------------------------");
            System.out.println(entry.getKey());
            System.out.println("-------------------------------------");
            List<BreadWinner> values = entry.getValue();
            for (BreadWinner name : values) {
                System.out.println(name.getName());
            }
        }

        System.out.println("13----");
        //Q.13 What is the total salary and average salary for all organzation

        Double avgSalary = breadWinners.stream()
                .collect(Collectors.averagingDouble(BreadWinner::getSalary));
        long totalCount = breadWinners.stream().count();
        System.out.println("Avearage Salary: " + avgSalary + " total salary: " + avgSalary * totalCount);

        DoubleSummaryStatistics statistics = breadWinners.stream()
                .collect(Collectors.summarizingDouble(BreadWinner::getSalary));
        System.out.println("Average Salary: " + statistics.getAverage());
        System.out.println("Total Salary: " + statistics.getSum());

        System.out.println("14----");
        //Q.14 Separate the employee who is >=25 and <25

        List<BreadWinner> youngerEqualTo25 = breadWinners.stream()
                .filter(emp -> emp.getAge() <= 25)
                .collect(Collectors.toList());
        List<BreadWinner> olderThan25 = breadWinners.stream()
                .filter(emp -> emp.getAge() > 25)
                .collect(Collectors.toList());
        System.out.println("Younger equal to 25: " + youngerEqualTo25 + " Older Than 25: " + olderThan25);

        Map<Boolean, List<BreadWinner>> booleanListMap = breadWinners.stream()
                .collect(Collectors.partitioningBy(age -> age.getAge() > 25));

        Set<Map.Entry<Boolean, List<BreadWinner>>> entries = booleanListMap.entrySet();
        for (Map.Entry<Boolean, List<BreadWinner>> entry : entries) {
            System.out.println("--------------------------------");
            if (entry.getKey()) {
                System.out.println("BreadWinners older than 25");
            } else {
                System.out.println("BreadWinners younger or equal to 25");
            }
            System.out.println("--------------------------------");
            List<BreadWinner> breadWinnerList = entry.getValue();
            for (BreadWinner breadWinner : breadWinnerList) {
                System.out.println(breadWinner.getName());
            }
            System.out.println("");
        }

        System.out.println("15----");
        //Q.15 Oldest Employee in thye organization with age and department

        BreadWinner breadWinner = breadWinners.stream()
                .max(Comparator.comparingDouble(BreadWinner::getAge)).get();
        System.out.println("Oldest BreadWinner details: " + breadWinner);

        System.out.println("16----");
        //Q.16 Most Experinced Person Details

        BreadWinner winner = breadWinners.stream()
                .min(Comparator.comparingDouble(BreadWinner::getYearOfJoining)).get();
        System.out.println("Most Experinced Person in the organization: " + winner);

        System.out.println("17----");
        //Q.17 Find The breadwinner name by their age

        Map<Integer, List<BreadWinner>> ageMap = breadWinners.stream()
                .collect(Collectors.groupingBy(BreadWinner::getAge));
        Set<Map.Entry<Integer, List<BreadWinner>>> entried = ageMap.entrySet();
        for (Map.Entry<Integer, List<BreadWinner>> entry : entried) {
            System.out.println("------------------------------");
            System.out.println(entry.getKey());
            System.out.println("------------------------------");
            List<BreadWinner> list = entry.getValue();
            for (BreadWinner breadWinner1 : list) {
                System.out.println(breadWinner1.getName());
            }
        }

        System.out.println("18----");
        //Q.18 Find Employees by group age

        Map<String, List<BreadWinner>> map = breadWinners.stream()
                .collect(Collectors.groupingBy(e -> {
                    if (e.getAge() < 30) return "20s";
                    else if (e.getAge() < 40) return "30s";
                    else return "40+";
                }));
        Set<Map.Entry<String, List<BreadWinner>>> set = map.entrySet();

        for (Map.Entry<String, List<BreadWinner>> entry : set) {
            System.out.println("-------------------------------");
            System.out.println(entry.getKey());
            System.out.println("-------------------------------");
            List<BreadWinner> list = entry.getValue();
            for (BreadWinner breadWinner1 : list) {
                System.out.println(breadWinner1.getName());
            }
        }
        System.out.println("19----");
        //Q.19 Find the common data from two employee list
        List<BreadWinner> empList1 = new ArrayList<>();

        empList1.add(new BreadWinner(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        empList1.add(new BreadWinner(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        empList1.add(new BreadWinner(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        empList1.add(new BreadWinner(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        empList1.add(new BreadWinner(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));

        List<BreadWinner> empList2 = new ArrayList<>();
        empList2.add(new BreadWinner(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        empList2.add(new BreadWinner(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));

        empList1.stream()
                .filter(empList2::contains)
                .forEach(System.out::println);

        breadWinners.stream()
                .filter(i -> i.getDepartment().toLowerCase().contains("sales"))
                .forEach(System.out::println);

        //Q.20 Find avg, max and min salary using summint=integer

        Map<String, DoubleSummaryStatistics> empStats = breadWinners.stream()
                .collect(Collectors.groupingBy(
                        BreadWinner::getDepartment,
                        Collectors.summarizingDouble(BreadWinner::getSalary)));

        empStats.forEach((department, stats) -> {
            System.out.println("department: " + department);
            System.out.println("Avg Salary: " + stats.getAverage());
            System.out.println("Max Salary: " + stats.getMax());
            System.out.println("Min Salary: " + stats.getMin());
        });

        //Q.21 Find the employees having nth salary per department

        List<Double> list = breadWinners.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("hr"))
                .map(BreadWinner::getSalary)
                .sorted(Comparator.reverseOrder())
                .toList();
        Double nthSalary = list.get(2 - 1);
        List<BreadWinner> winners = breadWinners.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("hr"))
                .filter(e -> Double.compare(e.getSalary(), nthSalary) == 0)
                .toList();

        winners.forEach(System.out::println);
    }
}
