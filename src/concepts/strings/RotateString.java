package concepts.strings;

public class RotateString {
    static void main() {
        String s1 = "abcde";
        String s2 = "cdeab";

        String s3 = s1 + s1;

        System.out.println(s3.contains(s2));
    }
}
