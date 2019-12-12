package com.designPattern.decorator_io;

import com.designPattern.decorator_io.othr.LowerCaseInputStream;

import java.io.*;

public class Run {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\localDev\\code\\seckill\\src\\test\\java\\com\\designPattern\\decorator_io\\test.txt")));
        while ((c=inputStream.read())>=0){
            System.out.print((char) c);
        }
    }
}
