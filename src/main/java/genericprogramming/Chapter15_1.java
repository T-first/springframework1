package genericprogramming;


import entity.Dog;
import entity.Pets;

import java.util.Map;

/**
 * 配合typeinfo.pets类库，用泛型类证明如果指定这个泛型类可以持有某个基类类型，
 * 那么他也能持有导出类。
 *
 * */







public class Chapter15_1<T> {
    private T holder1;
    public Chapter15_1(T t){
        holder1=t;
    }
    public T getHolder1(){
        return holder1;
    }
    public <T> void f(T t1,T t2,T t3){};//修饰符之后写泛型<泛型变量>
    public <T> void f(T t, int i){
    };
    //public static void f(T t){};    * error： static method can't use genericClass
    public static <T> void f(T t){

    }
    public static void main(String[] args) {
      //这个
        Chapter15_1<Pets>  petsChapter15_1 =  new Chapter15_1<>(new Pets());

        Chapter15_1<Dog>  dogChapter15_1 =new Chapter15_1<>(new Dog());

    }
}
