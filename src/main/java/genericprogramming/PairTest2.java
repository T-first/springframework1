package genericprogramming;

import java.time.LocalDate;

public class PairTest2 {

    public static void main(String[] args) {

        LocalDate[] mm = {LocalDate.of(1990,12,11),
                            LocalDate.of(1991,12,11),
                            LocalDate.of(1993,12,11),
                            LocalDate.of(1994,12,11)};
     ArrayAlg.mixmax(mm);
    }

}
