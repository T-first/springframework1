package log;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLogger {
    //高级日志
    private static final Logger logger = Logger.getLogger("log.TestLogger");
    public  String test(String param1,String param2){
        logger.entering("log.TestLogger","test",new Object[]{param1,param2});
        String res = param1+param2;
        logger.exiting("log.TestLogger","test",res);
        return res;
    }
    public static void main(String[] args) {
       /**
        * 生成简单的日志记录可以使用全局日志记录器（global logger）
        * */
       // Logger.getGlobal().info("File-Open menu item selected");
        //Logger.getGlobal().setLevel(Level.OFF);
        logger.setLevel(Level.ALL);
        logger.warning("真香警告！");
        logger.info("日志信息");
        Logger.getLogger("logger");
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        System.out.println(new TestLogger().test("测试参数1","测试参数2"));
    }

}
