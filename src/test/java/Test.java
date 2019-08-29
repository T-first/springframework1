import entity.Templet;
import entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Test {

    public static void main(String[] args) throws InterruptedException {

//        ArrayList<Templet> list =  new ArrayList<Templet>();
//        Templet t1 = new Templet(1L,new Date(),1L,1L,new User(1L,"admin",1,"xiaohua",1,"13994077145"));
//        Thread.sleep(1000L);
//        Templet t2 = new Templet(2L,new Date(),2L,2L,new User(2L,"user1",2,"xiaowang",1,"13039012772"));
       // list.stream().forEachOrdered(Templet);
//        Stream<Templet> st = list.stream().filter(t->t.getUser().getSex()==1);
//          st.forEach(x-> System.out.println(x.getId()));


//        Stream<String> words = Stream.of("Java", "Magazine", "is",
//                "the", "best");
//        Map<String, Long> letterToCount =
//                words.map(w -> w.split(""))
//                        .flatMap(Arrays::stream)
//                        .collect(groupingBy(identity(), counting()));
        System.out.println(subwayPrice(22,14));
    }
     public static double  subwayPrice(double totalday,double price){
         double days =0;
         double total=0;
         int index1 = 100/(int) price;
         for(int i=0;i<index1&&days<totalday;i++){
             total=total+price;
             days++;
         }
         for(int i=0;total<150&&days<totalday;i++){
             total=0.8*price + total;
             days++;
         }
         for(int i=0;total>150&&days<totalday;i++){
             total=0.5*price + total;
             days++;
         }
        return total;
     }
    }


