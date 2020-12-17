public class main {

    public static void main(String[] args) {
//        long niaveStart = System.nanoTime();
////        System.out.println(Fibonocci.fibNiave(7));
////        System.out.println(Fibonocci.fibNiave(8));
////        System.out.println(Fibonocci.fibNiave(10));
//        System.out.println(Fibonacci.fibNaive(50));
//        long niaveStop = System.nanoTime();
//        System.out.println("Time to run naive " + (niaveStop - niaveStart));
////        System.out.println(Fibonocci.fibonocci(6)); // 8
////        System.out.println(Fibonocci.fibonocci(7)); //13
////        System.out.println(Fibonocci.fibonocci(8));  //21
//
//        long start = System.nanoTime();
//        System.out.println(Fibonacci.fibonacci(50));// 12586269025
//        long stop = System.nanoTime();
//        System.out.println("Time to run Dynamic:  " + (stop - start));


        System.out.println(GridTraveler.numGridPathNaive(1,1)); // 1
        System.out.println(GridTraveler.numGridPathNaive(2,3)); // 3
        System.out.println(GridTraveler.numGridPathNaive(3,2)); // 3
//        System.out.println(GridTraveler.numGridPathNaive(18,18)); // 233360620
        System.out.println();

        System.out.println( GridTraveler.gridTravelerNumPaths(1,1)); // 1
        System.out.println(GridTraveler.gridTravelerNumPaths(2,3));// 3
        System.out.println(GridTraveler.gridTravelerNumPaths(3,2)); // 3
        System.out.println(GridTraveler.gridTravelerNumPaths(3,3));// 3
        System.out.println(GridTraveler.gridTravelerNumPaths(18,18));


    }


}
