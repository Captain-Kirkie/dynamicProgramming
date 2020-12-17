import java.util.HashMap;

public class GridTraveler {
    //structure like a tree
    public static long numGridPathNaive(long row, long column) {
        if (row == 1 && column == 1)
            return 1;
        if (row == 0 || column == 0)
            return 0;
        return numGridPathNaive(row - 1, column) + numGridPathNaive(row, column - 1);
    }




    public static long gridTravelerNumPaths(int row, int column) {
        HashMap<String, Long> memo = new HashMap<>();
        return gridTravelerRecursive(row, column, memo);
    }
    //gridTraveler(a, b) == gridTraveler(b,a)


    private static long gridTravelerRecursive(int row, int column, HashMap<String, Long> memo) {
        String key = Integer.toString(row) + ',' + Integer.toString(column); //this is the actual string column, row

        if(memo.containsKey(key))
            return memo.get(key);

        if (row == 1 && column == 1)
            return 1;

        if (row == 0 || column == 0)
            return 0;

        long result = gridTravelerRecursive(row - 1, column, memo) + gridTravelerRecursive(row, column - 1, memo);
        memo.put(key,result);

        return result;
    }


}
