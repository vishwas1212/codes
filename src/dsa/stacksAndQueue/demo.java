package dsa.stacksAndQueue;

public class demo {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(arr.length);
        int[] narr = new int[2 * arr.length];
        arr = narr;
        System.out.println(arr.length);
        arr = new int[6];
        System.out.println(arr.length);
    }
}
