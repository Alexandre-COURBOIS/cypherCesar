package com.alexandre;

import com.alexandre.algorythm.CaesarCipher;
import com.alexandre.algorythm.ShiftCalculator;
import com.alexandre.service.CharService;

public class Main {
    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        CharService charService = new CharService();
        ShiftCalculator shiftCalculator = new ShiftCalculator();

        String dataToUncrypt = "vcfgrwqwfsbhfsntowbsobgfsbhfsnqvsnjcigsghqsoixcifrviwtshseicwbsgojsnjcigdogeisjcigoihfsgofhwgobgjcigbsrsjsnqwfqizsfrobgzsgfisgzsgxcifgcijfopzsgeiojsqzsggwubsgrsjchfsdfctsggwcbdofzseiszsghhcbashwsf";

        char data = charService.findMostFrequentChar(dataToUncrypt);

        int shifter = shiftCalculator.calculateShift(data);

        String outPut = caesarCipher.decrypt(dataToUncrypt, shifter);

        System.out.println(outPut);
    }
}