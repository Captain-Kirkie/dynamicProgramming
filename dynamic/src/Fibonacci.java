import java.util.HashMap;

public class Fibonacci {
    // Memoization - store stuff so you dont use duplicates
    // reminder, store duplicate sub problems
    // HashMap keys arg to function, value is return value

    public static long fibNaive(long n) {
        if (n <= 2)
            return 1;
        return fibNaive(n - 1) + fibNaive(n - 2);

    }


    /**
     * pass a hash map through that stores to values assoiated with the recurcive n
     * if that hash map contains that n, return the value....
     * else calculate that value and add it to the hashmap (Random access!)
     */
    public static long fibonacci(long n) {
        HashMap<Long, Long> memo = new HashMap<>();
        return fibonacciRecursive(n, memo);
    }

    //memo stores n as key, and return value as value
    private static long fibonacciRecursive(long n, HashMap<Long, Long> memo) { //pass a hash map, to store args to function and return values
        if (memo.containsKey(n))
            return memo.get(n);
        if (n <= 2)
            return 1;
        //store n value in memo if it is not in there
        memo.put(n, fibonacciRecursive(n - 1, memo) + fibonacciRecursive(n - 2, memo));
        return memo.get(n);
    }


}
