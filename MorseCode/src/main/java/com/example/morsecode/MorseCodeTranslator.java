package com.example.morsecode;

import java.util.HashMap;
import java.util.Map;


public class MorseCodeTranslator {
    Map<String, Character> mapping = new HashMap<String, Character>();

    String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
            "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "/"};

    char[] letter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' '};

    public MorseCodeTranslator() {
        setupMap();
    }

    private void setupMap () {
        for (int i = 0; i < letter.length; i++) {
            mapping.put(morse[i], letter[i]);
        }
    }

    public String translateToEnglish (String text){
        char[] characters = toString().toCharArray();
        StringBuilder morseString = new StringBuilder();

        for (char character : characters) {
            morseString.append(mapping.get(character));
        }
        return String.valueOf(morseString);
    }
}
