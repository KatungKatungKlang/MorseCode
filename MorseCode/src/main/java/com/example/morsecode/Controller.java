package com.example.morsecode;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private TextArea textInput;

    @FXML
    private Button playAudio;
    @FXML
    private Button swapInput;
    @FXML
    private Button refreshInput;

    @FXML
    private TextArea textOutput;

    MorseCodeTranslator morseCodeTranslator = new MorseCodeTranslator();

    @FXML
    void updateMorseCode(KeyEvent event) {
        textOutput.setText(morseCodeTranslator.translateToEnglish(textInput.getText()));
    }

}