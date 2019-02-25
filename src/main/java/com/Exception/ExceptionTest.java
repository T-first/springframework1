package com.Exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionTest {

    public void read(String filename){

        try{
            InputStream in  =new FileInputStream(filename);
            int b;
            while((b=in.read())!=-1){

            }
        }catch(IOException e){
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
    public void testFileFormatException() throws FileFormatException {
        int i=2;
        if(i==2)
        throw new FileFormatException("出现了格式错误");
    }

    public void testFileFileFormatException1(){
        try{
            try {
                int i=2;
                if (i>1)
                    if(i>1)
                        throw new IOException("管道出错");
            }
            finally{
                throw new FileFormatException("FileFormatException1 exception");
            }
        }catch (FileFormatException f){
            f.printStackTrace();
        }catch (IOException e){
           e.printStackTrace();
        }

    }
    public static void main(String[] args) throws FileFormatException {

        //new ExceptionTest().read("121212");
//         new ExceptionTest().testFileFormatException();
        new ExceptionTest().testFileFileFormatException1();
    }

}
