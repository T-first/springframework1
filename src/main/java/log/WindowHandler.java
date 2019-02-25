package log;

import javax.swing.*;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.StreamHandler;

public class WindowHandler extends StreamHandler {

    public WindowHandler(){
        final JTextArea output = new JTextArea();
        setOutputStream(new OutputStream() {
            public void write(int b){

            }
        });

    }
}
