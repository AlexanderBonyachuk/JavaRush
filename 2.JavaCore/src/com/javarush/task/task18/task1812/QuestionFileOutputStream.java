package com.javarush.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream amigoOutputStream;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public QuestionFileOutputStream(AmigoOutputStream a1) {
        this.amigoOutputStream = a1;
    }

    @Override
    public void flush() throws IOException {
        amigoOutputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        amigoOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        if (reader.readLine().equals("Д")) amigoOutputStream.close();
//        while (true) {
//            str = reader.readLine();
//            if (str.equals("Д")) {
//                amigoOutputStream.close();
//                reader.close();
//                break;
//            }
//        }
    }
}

