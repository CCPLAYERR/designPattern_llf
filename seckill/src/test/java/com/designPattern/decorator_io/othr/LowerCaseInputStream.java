package com.designPattern.decorator_io.othr;

import java.io.*;


public class LowerCaseInputStream extends FilterInputStream {


    public LowerCaseInputStream(InputStream in)  {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return  (c == -1 ? c : Character.toLowerCase((char) c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b,off,len);
        int i = result + off;
        for (int i1 = 0; i1 < i; i1++) {
            b[i1] = (byte) Character.toLowerCase((char)b[i1]);
        }
        return  result;
    }
}
