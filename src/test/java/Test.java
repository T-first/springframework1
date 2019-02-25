import entity.Templet;
import entity.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<Templet> list =  new ArrayList<Templet>();
        Templet t1 = new Templet(1L,new Date(),1L,1L,new User(1L,"admin",1,"xiaohua",1,"13994077145"));
        Thread.sleep(1000L);
        Templet t2 = new Templet(2L,new Date(),2L,2L,new User(2L,"user1",2,"xiaowang",1,"13039012772"));
       // list.stream().forEachOrdered(Templet);
        Stream<Templet> st = list.stream().filter(t->t.getUser().getSex()==1);
          st.forEach(x-> System.out.println(x.getId()));
    }
}