package com.example.morsecode;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.util.HashMap;
import java.util.Map;


public class MorseCodeTranslator {

    HashMap<Character, String> mapping = new HashMap<Character, String>();

    char[] letter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' '};

    String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
            "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "/"};

    public MorseCodeTranslator() {
        setupMap();
    }

    private void setupMap () {
        for (int i = 0; i < letter.length; i++) {
            mapping.put(letter[i], morse[i]);
        }
    }

    public String translateToEnglish (String string){
        char[] characters = string.toCharArray();
        StringBuilder morseString = new StringBuilder();

        for (char character : characters) {
            morseString.append(mapping.get(character));
        }
        return String.valueOf(morseString);
    }
}
