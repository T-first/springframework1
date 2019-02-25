package JNDI;

public class HelloWord {
    public native void sayHello();

    static {
        System.loadLibrary("JNITest");
    }

    public static void main(String[] args) {
        //new HelloWord().sayHello();
        HelloWord helloWord = new HelloWord();
        helloWord.sayHello();
        System.out.println(System.getProperties().toString());
    }
}
