package concepts.oops.abstracts;

public class Driver {
    public static void main(String[] args) {
        //      AbstractCheck abstractCheck = new AbstractCheck();

        String str = "JAHAJ";
        String pallindrome = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            pallindrome = pallindrome + c;
        }
        System.out.println(str + " " + pallindrome);
        System.out.println(str.equals(pallindrome));
    }
}
