public class StringTest {

    public static void main(String[] args) {
        String  s= "hello";
        String  st = new String("hello");
        System.out.println(s.hashCode());
         changeString(s);
        System.out.println("------------------------");
        System.out.println(st.hashCode());
         changeString(st);
//        System.out.println(s+":"+st);
    }

    public static void changeString(String s){
        System.out.println(s.hashCode());
        s+="word";
        System.out.println();
        System.out.println(s.hashCode());
    }
}
