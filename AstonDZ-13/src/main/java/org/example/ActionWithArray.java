package org.example;

import java.util.HashMap;

public class ActionWithArray {
    public void countWordInArray(String[] array) {
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : array)
        {
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        System.out.println("Количество каждого слова в массиве\n");
        for (String word : wordToCount.keySet())
        {
            System.out.println(word + " " + wordToCount.get(word));
        }
        System.out.println("\nСписок уникальных слов\n");
        for (String word : wordToCount.keySet())
        {
            if(wordToCount.get(word) == 1) {
                System.out.println(word);
            }
        }
    }
}
