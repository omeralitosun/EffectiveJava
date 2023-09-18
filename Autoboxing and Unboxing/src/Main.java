import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        // Autoboxing (int to Integer)
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i < 50; i += 2)
            li.add(i); // li.add(Integer.valueOf(i));

        // Unboxing (Integer to int)
        int sum = 0;
        for (Integer i: li)
            if (i % 2 == 0) // if (i.intValue() % 2 == 0)
                sum += i;
    }
}
