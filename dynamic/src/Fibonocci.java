import java.util.HashMap;

public class Fibonocci {
    // Memoization - store stuff so you dont use duplicates
    // reminder, store duplicate sub problems
    // HashMap keys arg to function, value is return value

    public static long fibNiave(long n) {
        if (n <= 2)
            return 1;
        return fibNiave(n - 1) + fibNiave(n - 2);

    }


    /**
     * pass a hash map through that stores to values assoiated with the recurcive n
     * if that hash map contains that n, return the value....
     * else calculate that value and add it to the hashmap (Random access!)
     */
    public static long fibonocci(long n) {
        HashMap<Long, Long> memo = new HashMap<>();
        return fibonocciRecursive(n, memo);
    }

    //memo stores n as key, and return value as value
    private static long fibonocciRecursive(long n, HashMap<Long, Long> memo) { //pass a hash map, to store args to function and return values
        if (memo.containsKey(n))
            return memo.get(n);
        if (n <= 2)
            return 1;
        //store n value in memo if it is not in there
        memo.put(n, fibonocciRecursive(n - 1, memo) + fibonocciRecursive(n - 2, memo));
        return memo.get(n);
    }


}
