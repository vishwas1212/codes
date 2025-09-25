package concepts.arrays;

public class ArrayProd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            prod = prod * arr[i];
        }
        System.out.println(prod);
        int skipId = 1, result = 0;
        for (int i = 0; i < arr.length; i++) {
            skipId = arr[i];
            result = prod / skipId;
            System.out.println(result);
        }

    }
}
