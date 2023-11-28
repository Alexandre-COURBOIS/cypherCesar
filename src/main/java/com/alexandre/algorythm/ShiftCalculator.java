package com.alexandre.algorythm;

public class ShiftCalculator {

    public int calculateShift(char character) {
        char base = Character.isLowerCase(character) ? 'a' : 'A';
        int shift = (character - base) - ('e' - base);

        if (shift < 0) {
            shift += 26;
        }

        return shift;
    }
}
