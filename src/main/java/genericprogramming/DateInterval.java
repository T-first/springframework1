package genericprogramming;

import java.time.LocalDate;

public class DateInterval extends Pair{

 public void setSecond(LocalDate second){
     if (second.compareTo((LocalDate)getFirst())>=0){
         super.setSecond(second);
     }
 }
}
