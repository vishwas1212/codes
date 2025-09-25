package coding;

public class FIndFirstOccurence {
    public static void main(String[] args) {
        String str = "asde";
        char arr[] = str.toCharArray();
        int count = 0;
        int rep = 0;
        int fr = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            char ch = str.charAt(i);
            count = 0;
            for (int j = 1; j < arr.length - 1; j++) {
                if (ch == arr[j]) {
                    count++;
                }
                if (count == 1) {
                    fr = arr[j];
                    rep++;
                    break;
                }
            }
        }
        if (rep > 0 ) {
            System.out.println((char) fr);
        } else {
            System.out.println(count);
        }
    }
}
