package com.example.morsecode;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class Controller {

    @FXML
    private TextArea morseInput;

    @FXML
    private TextArea textOutput;

    MorseCodeTranslator morseCodeTranslator = new MorseCodeTranslator();

    @FXML
    void updateMorseCode(KeyEvent event) {
        textOutput.setText(morseCodeTranslator.translateToEnglish(morseInput.getText()));
    }
}