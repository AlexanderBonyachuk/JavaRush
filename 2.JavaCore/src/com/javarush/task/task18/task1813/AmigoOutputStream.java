package com.javarush.task.task18.task1813;

import java.io.*;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    private FileOutputStream original;

    public static String fileName = "C:/tmp/result.txt";
//    public static String fileName = "C:/tmp/result.txt";

    public AmigoOutputStream(FileOutputStream fileInputStream) throws FileNotFoundException {
        super(fileName);
        this.original = fileInputStream;
    }

    @Override
    public void write(int a) throws IOException {
        original.write(a);
    }

    @Override
    public void write(byte[] b) throws IOException {
        original.write(b);
    }

    @Override
    public void write(byte[] a, int b, int c) throws IOException {
        original.write(a, b, c);
    }

    @Override
    public void flush() throws IOException {
        original.flush();
    }

    @Override
    public void close() throws IOException {
        original.flush();
        write("JavaRush © All rights reserved.".getBytes());
        original.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
