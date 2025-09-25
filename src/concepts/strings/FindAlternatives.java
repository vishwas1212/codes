package concepts.strings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindAlternatives {
    static void main() {
        String s1 = "Vishwas";
        String s2 = "Vimal";
        String s3 = "Java";

        int l = 0, r = 0;
        StringBuilder res = new StringBuilder();
        int maxLen = Math.max(s1.length(), Math.max(s2.length(), s3.length()));

        int maxLength = s1.length() > s2.length() ? s1.length() : s2.length();
        System.out.println(maxLength);

        for (int i = 0; i < maxLen; i++) {
            if (i < s2.length()) {
                res.append(s2.charAt(i));
            }
            if (i < s1.length()) {
                res.append(s1.charAt(i));
            }
        }
        System.out.println(res);

        String result = IntStream.range(0, maxLen)
                .mapToObj(i -> {
                    StringBuilder sb = new StringBuilder();
                    if (i < s3.length()) sb.append(s3.charAt(i));
                    if (i < s2.length()) sb.append(s2.charAt(i));
                    if (i < s1.length()) sb.append(s1.charAt(i));
                    return sb;
                }).collect(Collectors.joining());
        System.out.println(result);

        List<String> lists = List.of("Vishwas", "Vimal", "Java");
        int max = lists.stream().mapToInt(String::length).max().orElse(0);

        String collected = IntStream.range(0, max)
                .mapToObj(i ->
                        lists.stream().filter(s -> i < s.length())
                                .map(s -> String.valueOf(s.charAt(i)))
                                .collect(Collectors.joining()))
                .collect(Collectors.joining());
        System.out.println(collected);
    }
}
