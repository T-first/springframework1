package lambda;

import java.sql.SQLOutput;
import java.util.Comparator;

/**
  * lambda表达式的用法
  * 重点：延迟执行
  * 1.重复执行
  * 2.
  * */
public class UsedInfo {

    public static void repeat(int n,Runnable action){
     for(int i=0;i<n;i++) action.run();
    }
     public static void repeat2(int n,FunctionInterface functionInterface){
        for (int i=0;i<n;i++)functionInterface.function(i);
     }

     public static void main(String[] args) {

        repeat(10,()->System.out.println("Hello world"));
        repeat2(10,i -> System.out.println(i));
     }



}
