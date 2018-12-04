package com.nebrija.tpra;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SignUpPageController {

    @FXML
    private TextField emailText;

    @FXML
    private TextField usernameText;

    @FXML
    private TextField passwordText;

    @FXML
    private Button signUpButton;

    @FXML
    private Button WebShopButton;

    @FXML
    void enterEmailText(ActionEvent event) {

    }

    @FXML
    void enterPasswordText(ActionEvent event) {

    }

    @FXML
    void enterUsernameText(ActionEvent event) {

    }

    @FXML
    void pressSignUpButton(ActionEvent event) {

    }

    @FXML
    void pressWebShopButton(ActionEvent event) {
    	Interface.signUpStage.close();
    	Interface.webShopPrimary.show();

    }

}
