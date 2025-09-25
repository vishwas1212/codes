package jpmc;

public class ConsignmentBalancer {
    public static void main(String[] args) {
        int[] quantity = {3, 7, 4, 2}; // Example
        int minOperations = minOperationsToBalance(quantity);
        System.out.println("Minimum operations required: " + minOperations);
    }

    private static int minOperationsToBalance(int[] quantity) {
        int n = quantity.length;
        int ts = 0;

        for (int q : quantity) {
            ts += q;
        }

        int ls = 0;
        int minOps = Integer.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            ls = ls + quantity[i];
            int rs = ts - ls;

            int diff =Math.abs(ls - rs);
            minOps = Math.min(minOps, diff);
        }
        return minOps;
    }
}
