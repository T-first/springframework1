package lambda;

public interface Wheeler {
    default void print(){
        System.out.println("我是一辆四轮车！");
    }
}
