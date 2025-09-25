package concepts.java8.nonobjects;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TxtFileStream {
    public static void main(String[] args) throws IOException {
        //   String blogFile = "C:\\Users\\vish1\\OneDrive\\Desktop\\Workspace\blog.txt";
        String blogFile = "C:\\Users\\vish1\\OneDrive\\Desktop\\Workspace\\blog.txt";

        Map<String, Long> txtMap = Files.lines(Paths.get( blogFile))
                .map(line -> line.replaceAll("[^a-zA-Z ]", "").toLowerCase())
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .filter(word -> !word.isEmpty())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        txtMap.forEach((str, value) -> {
            System.out.println(str + " : " + value);
        });

    }
}
