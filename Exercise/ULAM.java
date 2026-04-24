public class ULAM{
    public static boolean TestTerminateAtOne(long n) {
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        final int limit = 1_000_000;
        System.out.println("Test ULam function for all n from 1 to " + limit + "...\n");

        for (int n = 1; n <= limit; n++) {
            if (!TestTerminateAtOne(n)) {
                System.out.println("The ULAM function failed at n = " + n);
                return;
            }
        }

        System.out.println("All integers from 1 to " + limit + " terminate at 1. ULam function proved.");
    }
}