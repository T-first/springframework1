package lambda;

import java.util.Date;

public interface FunctionInterface {

    default void function(int i){
        System.out.println(i);
    }
    void function2(int i);
}
