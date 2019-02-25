package com.Exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionTest1 {

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

    public void newIoException () throws IOException {
        try{
            int i=2;
            if (i>1)
                if(i>1)
                    throw new IOException("管道出错");

        }catch (IOException e){
           throw  new IOException("新定义的io异常分类");

        }

    }
    //将try中声明的
    public void testFileFileFormatException1 () throws Throwable {
        int i=1;
        try{
            while(i==1){
                throw  new  IOException();

            }
        }catch (IOException e){
            Throwable te = new FileFormatException("自己定义的io异常");
             te.initCause(e);
                 throw  te;

        }

    }
    //当
    public void  embedCatch(){

        try{
            try {

            }finally {

            }
        }catch(Exception e){}
    }

    public String  f(){
        try {
            return null;
        }finally {
            return null;
        }
    }
    //try语句异常finally语句也产生异常。
    public void test(){
        InputStream in =null;
        try {
            in.read();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                in.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws IOException,Throwable {

        //new ExceptionTest().read("121212");
//         new ExceptionTest().testFileFormatException();
        try {
            new ExceptionTest1().newIoException();
        }catch (IOException e){
            try {
                new ExceptionTest1(). testFileFileFormatException1();
            }catch (Exception i){
                i.printStackTrace();
                Throwable th = i.getCause();
                th.printStackTrace();
            }
        }
        //try语句异常finally语句也产生异常
        new ExceptionTest1().test();

    }

}
