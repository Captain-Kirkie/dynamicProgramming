import java.io.FileOutputStream;

public class main {

    public static void main(String [] args){
        
        Fibonocci f = new Fibonocci();

        long niaveStart = System.nanoTime();
        
//        System.out.println(Fibonocci.fibNiave(7));
//        System.out.println(Fibonocci.fibNiave(8));
//        System.out.println(Fibonocci.fibNiave(10));
        System.out.println(Fibonocci.fibNiave(50));
        long niaveStop = System.nanoTime();
        System.out.println("Time to run naive " +  (niaveStop - niaveStart));

//        System.out.println(Fibonocci.fibonocci(6)); // 8
//        System.out.println(Fibonocci.fibonocci(7)); //13
//        System.out.println(Fibonocci.fibonocci(8));  //21

        long start = System.nanoTime();
        System.out.println(Fibonocci.fibonocci(50));// 12586269025
        long stop = System.nanoTime();

        System.out.println("Time to run Dynamic:  " + (stop - start));


        

    }



}
