package com.alexandre.algorythm;

public class CaesarCipher {

    public String decrypt(String text, int shifter) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isLetter(currentChar)) {
                char base = Character.isLowerCase(currentChar) ? 'a' : 'A';
                result.append(wrapChar(currentChar, shifter, base));
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    private char wrapChar(char character, int shifter, char base) {
        return (char) ((character - shifter - base + 26) % 26 + base);
    }

}
