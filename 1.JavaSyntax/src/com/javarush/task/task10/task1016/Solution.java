package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list)  {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
//        result.put("Ничего", -1);  // это добавлял ранее, чтобы читался ХэшМэп

        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            int j = 0, param = 1;
            while (true) {
                j++;
                if (i+j >= list.size()) {
                    if (!(result.containsKey(list.get(i))))  // проверяем есть ли в ХашМапе ключ такой же как значение из списка
                        result.put(list.get(i),param);
                    break;
                }
                    if (list.get(i).equals(list.get(i+j))) {
                        param++;
                    }
            }
        }
//        result.remove("Ничего");  // удаляем введенную ранее дополнительную ячеку
        return result;
    }
}

