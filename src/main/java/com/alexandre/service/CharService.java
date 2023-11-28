package com.alexandre.service;

import java.util.HashMap;
import java.util.Map;

public class CharService {
    public char findMostFrequentChar(String text) {
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char ch : text.toCharArray()) {
            frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);
        }

        char mostFrequentChar = ' ';

        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentChar = entry.getKey();
            }
        }

        return mostFrequentChar;
    }
}

