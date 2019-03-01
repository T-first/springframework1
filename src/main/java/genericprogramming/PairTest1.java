package genericprogramming;

public class PairTest1 {

    public static void main(String[] args) {
        //进行字符串的比较返回最大最小值
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> mm =  ArrayAlg.mixmax(words);
        System.out.println(mm.getFirst());
        System.out.println(mm.getSecond());
    }


}
class ArrayAlg {
   //泛型的类型变量T放修饰符的后边返回值的前边
    public static <T extends  Comparable> Pair<T> mixmax(T[] s) {
        if (s == null || s.length == 0) return null;
        T min = s[0];
        T max = s[0];
        for (int i = 0; i < s.length; i++) {
            if (min.compareTo(s[i]) < 0)
                max = s[i];
            if (max.compareTo(s[i]) > 0)
                min = s[i];
        }
        return new Pair<>(min, max);
    }
}
