package array;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Stream;

public class UniqueNumber {

    public static void main(String[] args) {
        Integer value = new Integer(122345);
        Function<Integer,Stream<Integer>> convertToIntStream = (input)-> {
            synchronized (UniqueNumber.class) {
                ArrayList result = new ArrayList<>();
                while (input > 0) {
                    result.add(Integer.valueOf(input % 10));
                    input = input / 10;
                }
                return result.stream();
            }
        };

        convertToIntStream.apply(value).distinct().forEach(System.out::print);

    }

}
