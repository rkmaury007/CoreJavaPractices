package company;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.LongStream;

public class T5 {
    public static void main(String[] args) {
        Optional<String> op=Optional.of("First");
        op.ifPresent(System.out::println);
        OptionalInt oInt = OptionalInt.of(2);
        oInt.ifPresent(System.out::println);
        OptionalLong ol=OptionalLong.of(2222);
        if(ol.isPresent()){
            long ll=ol.getAsLong();
            System.out.println(ll);
        }
        OptionalLong oStream = LongStream.range(3,6).limit(10).max();
        if(oStream.isPresent()){
            long f=oStream.getAsLong();
            System.out.println(f);
        }
    }
}
