package com.example.morsecode;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class Controller {

    @FXML
    private TextArea textInput;

    @FXML
    private Button playAudio, swapInput, clearInput;

    @FXML
    private TextArea textOutput;

    MorseCodeTranslator morseCodeTranslator = new MorseCodeTranslator();

    @FXML
    void updateMorseCode(KeyEvent event) {
        textOutput.setText(morseCodeTranslator.abc2morse(textInput.getText()));
    }
    @FXML
    void outputClicked(){
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setHeaderText("Input not valid");
        errorAlert.setContentText("Cannot type in output field");
        errorAlert.showAndWait(); //alert als er in output getypt word

    }
}