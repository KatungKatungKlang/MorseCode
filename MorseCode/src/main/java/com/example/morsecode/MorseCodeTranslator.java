package com.example.morsecode;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextFormatter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.UnaryOperator;


public class MorseCodeTranslator {


    HashMap<Character, String> mapping = new HashMap<Character, String>();

    char[] letter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ',
            '.', ',', ':', '"', '?', '!', '+', '-', '='};

    String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
            "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "/",
            ".-.-.-", "--..--", "---...", ".-..-.", "..--..", "-.-.--", ".-.-.", "-....-", "-...-"};


    public MorseCodeTranslator() {
        setupMap();
    }

    private void setupMap () {
        for (int i = 0; i < letter.length; i++) {
            mapping.put(letter[i], morse[i]);
        }
    }

    public String abc2morse (String string){
        string = string.toLowerCase(Locale.ROOT); // je string variable is nu gewoon je oude string variable maar lowercase
        char[] characters = string.toCharArray();
        StringBuilder morseString = new StringBuilder();

        for (char character : characters) {
            morseString.append(mapping.get(character));
        }
        return String.valueOf(morseString);
    }
/*    private TextFormatter createLetterFormatter(TextArea secondary){
        UnaryOperator<TextFormatter.Change> outputFilter = change -> {
            if (change.getControlNewText().matches("a-zA-Z0-9\\s]+") || change.getControlNewText().isBlank()){
                return change;
            }
        };
        return null;
    }*/
}
