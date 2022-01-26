package com.javarush.task.task18.task1826;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
//        args = new String[]{"-e fileName fileOutputName", "-d fileName fileOutputName"};
//        args = new String[]{"-e D:\\texst\\out.txt D:\\texst\\out2.txt", "-d fileName fileOutputName"};
//        args = new String[]{"-d D:\\texst\\out2.txt D:\\texst\\out.txt", "-d fileName fileOutputName"};
//
//        String fileName = args[0].substring(3, 1+(args[0].indexOf(' ', 3)));
//        String fileOutputName = args[0].substring(1+(args[0].indexOf(' ', 3)), args[0].length());
//        System.out.println(fileName);
//        System.out.println(fileOutputName);
//
//        try ( FileInputStream inputStream = new FileInputStream(fileName);
//        FileOutputStream fileOutputStream = new FileOutputStream(fileOutputName); ) {
//            String line;
//            ArrayList<Byte> arrBts = new ArrayList<>();
//            SecretKeySpec key = new SecretKeySpec("1234567891011121".getBytes(), "AES"); // пароль
//            byte[] bytes;
//            switch (args[0].substring(0, 2)) {
//                case "-e":
//                    System.out.println("зашифровать ");
//                    while (inputStream.available() > 0) {
//                        int mb = inputStream.read();
//                        if (mb == '\n' || inputStream.available() == 0) {
//                            byte[] lnb = new byte[arrBts.size()];
//                            for (int i = 0; i < arrBts.size(); i++) {
//                                lnb[i] = arrBts.get(i);
//                            }
//                            line = new String(lnb);
//                            System.out.println(line);
//                            // тут добавить шифровку
//                            Cipher cipher = Cipher.getInstance("AES");
//                            cipher.init(Cipher.ENCRYPT_MODE, key);
//                            bytes = cipher.doFinal(line.getBytes());
//                            for (byte b : bytes) {
//                                fileOutputStream.write(b);
//                            }
//
//                            arrBts.clear();
//                        } else {
//                            arrBts.add((byte) mb);
//                        }
//                    }
//                    break;
//                case "-d":
//                    System.out.println("расшифровать  ");
//                    while (inputStream.available() > 0) {
//                        int mb = inputStream.read();
//                        if (mb == '\n' || inputStream.available() == 0) {
//                            byte[] lnb = new byte[arrBts.size()];
//                            for (int i = 0; i < arrBts.size(); i++) {
//                                lnb[i] = arrBts.get(i);
//                            }
//                            line = new String(lnb);
//                            System.out.println(line);
//                            Cipher decriptCipher = Cipher.getInstance("AES");
//                            decriptCipher.init(Cipher.DECRYPT_MODE, key);
//                            byte[] decriptBytes = decriptCipher.doFinal(lnb);
//                            for (byte b : decriptBytes) {
//                                fileOutputStream.write(b);
//                            }
//
//                            arrBts.clear();
//                        } else {
//                            arrBts.add((byte) mb);
//                        }
//                    }
//                    break;
//            }
//        }
        String mode = args[0];
        if (!(mode.equals("-e") || mode.equals("-d"))) return;
        try (FileInputStream fileInputStream = new FileInputStream(args[1]);
             FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {

            if (mode.equals("-e")) {
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read() + 32);
                }
            } else {
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read() - 32);
                }
            }
        }
    }

}
