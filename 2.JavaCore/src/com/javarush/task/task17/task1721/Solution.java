package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {

        Solution solution = new Solution();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name1 = reader.readLine(); // Считать с консоли 2 имени файла


            BufferedReader readerFile1 = new BufferedReader(new FileReader(new File(name1)));
            String line1 = readerFile1.readLine();
            while (line1 != null) {
                allLines.add(line1);
                line1 = readerFile1.readLine();
            }
            readerFile1.close();

            String name2 = reader.readLine();
            reader.close();
            BufferedReader readerFile2 = new BufferedReader(new FileReader(new File(name2)));
            String line2 = readerFile2.readLine();
            while (line2 != null) {
                forRemoveLines.add(line2);
                line2 = readerFile2.readLine();
            }
            readerFile2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            solution.joinData();
//            allLines.add(0,"-");
//            System.out.println(allLines);
//            System.out.println(forRemoveLines);
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }

    }

        public void joinData() throws CorruptedDataException {
            String lineRemove;
            String lineAll;

            int compare = 0;
            for (int i = 0; i < forRemoveLines.size(); i++) {
                lineRemove = forRemoveLines.get(i);
                for (int j = 0; j < allLines.size(); j++) {
                    lineAll = allLines.get(j);
                    if (lineAll.equals(lineRemove)) {
                        ++compare;
                        allLines.remove(lineAll);
                        break;
                    }
                }
            }
            if (compare == forRemoveLines.size()) {

            } else {
                allLines.clear();
                throw new CorruptedDataException();
            }
        }
}
