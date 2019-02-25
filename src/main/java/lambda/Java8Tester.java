package lambda;

import java.util.Arrays;
import java.util.List;

public class Java8Tester {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        list.forEach( System.out::println);
        Java8Tester java8Tester =  new Java8Tester();
        MathOperation addOperation = (a,b) -> a+b;
        MathOperation subtraction = (a,b) -> a-b;
        MathOperation division = (a,b) -> a/b;
        MathOperation multiplication = (a,b) -> {return a*b;};
        MathOperation mo = (a,b) -> a*b;
        System.out.println(java8Tester.operate(1,2,addOperation));
        System.out.println(java8Tester.operate(3,2,multiplication));
        System.out.println(java8Tester.operate(3,2,mo));
    }
    private int operate(int a,int b,MathOperation mathOperation){
            return mathOperation.operation(a,b);
    }
}
interface MathOperation{
    int operation(int a,int b);
}

