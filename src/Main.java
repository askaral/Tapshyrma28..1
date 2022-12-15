import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Integer [] integers = new Integer[10];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt(1, 30);
            System.out.print(integers[i]+" ");
        }
        System.out.println();
            long lo = Arrays.stream(integers).filter(x->x%2==0).peek(x->System.out.print(x+" = "+x*x+"\n")).
                    max(Integer::compare).get();
                    System.out.println("max num: "+lo*lo);


    }
}