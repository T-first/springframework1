package stacktrace;

import java.util.HashMap;
import java.util.Map;

/**
 * A program  that display a trace feature of a recursive method call.
 * 一个用来展示递归的堆栈轨迹的程序
 * @author  甲第升科
 */
public class StackTraceTest {
 /**
  * computes the factorial of  a number
  * */
    public static int factorial(int n){
        System.out.println("facorial("+ n +")");
        Throwable throwable = new Throwable();
        StackTraceElement[] stackTraceElements=throwable.getStackTrace();
        for(StackTraceElement s:stackTraceElements){
            Map<String,String> map  =new HashMap<String, String>();
            map.put("ClassName",s.getClassName());
            map.put("FileName",s.getFileName());
            map.put("MethodName",s.getMethodName());
            map.put("LineNumber",String.valueOf(s.getLineNumber()));
            System.out.println(map.toString());
            System.out.println(s.toString());
        }
     if(n<=1)
         return  1;
     else
         return factorial(n-1)*n;
    }
    public static void testFunction(int index){
        if (index>=3)
            System.out.println(2);
        else
            //System.out.println(index); 递归的时候加上这句话是错的 报
            testFunction(index+1);

    }
    public static void main(String[] args) {
          factorial(4);
//        testFunction(0);
    }

}
