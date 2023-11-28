package com.alexandre;

import com.alexandre.algorythm.CaesarCipher;

public class Main {
    public static void main(String[] args) {

        String dataToUncrypt = "vcfgrwqwfsbhfsntowbsobgfsbhfsnqvsnjcigsghqsoixcifrviwtshseicwbsgojsnjcigdogeisjcigoihfsgofhwgobgjcigbsrsjsnqwfqizsfrobgzsgfisgzsgxcifgcijfopzsgeiojsqzsggwubsgrsjchfsdfctsggwcbdofzseiszsghhcbashwsf";
        CaesarCipher caesarCipher = new CaesarCipher();

        for (int i = 0; i < 26; i++) {
            System.out.println("test avec : " + i);
            System.out.println(caesarCipher.decrypt(dataToUncrypt, i));
            System.out.println('\n');
        }
    }
}